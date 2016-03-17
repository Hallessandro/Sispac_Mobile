/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.reservas;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hallessandro
 */
public class ReservaDAO extends GeralDAO{
        private final String INSERT = "insert into tbl_reserva_sala (data_reserva,horario_reserva,"
                                          + "tbl_professor_id_professor, tbl_sala_id_sala) values (?,?,?,?);";
        
            private final String QUERY_RESERVA_BY_HORARIO = "select * from tbl_salas_reservadas "
                                                            + "where num_sala = ? "
                                                            + "and data = ? "
                                                            //+ "and nome_reservou = ? "
                                                            //+ "and matricula_reservou = ? "
                                                            + "and horario = ?;"; 
            
            private final String QUERY_RESERVA = "select * from tbl_salas_reservadas where data = ?"; 

            public void inserirReserva(reservas r) throws SQLException{
                executarComando(INSERT, r.getNum_sala(),r.getData(), r.getHorario(), r.getNome_reservou(), r.getMatricula_reservou());
            }


            public reservas getReservaByHorario(int num_sala, int data, String horario) throws SQLException{
                ResultSet resultado = executarConsulta(QUERY_RESERVA_BY_HORARIO, num_sala, data, horario);        
                resultado.next();
                reservas r = popularReserva(resultado);
                return r;
            }

            public List<reservas> getReservas(int data) throws SQLException{
                ResultSet resultado = executarConsulta(QUERY_RESERVA,data);        
                ArrayList<reservas> rsvs = new ArrayList<>();
                while (resultado.next()){
                    reservas r = popularReserva(resultado);
                    rsvs.add(r);
                }
                return rsvs;        
            }

            private reservas popularReserva(ResultSet resultado) throws SQLException{
                reservas r = new reservas();
                r.setNum_sala(resultado.getInt("num_sala"));
                r.setData(resultado.getInt("data"));
                r.setHorario(resultado.getString("horario"));
                r.setNome_reservou(resultado.getString("nome_reservou"));
                r.setMatricula_reservou(resultado.getString("matricula_reservou"));
                return r;        
            }    
            
}
