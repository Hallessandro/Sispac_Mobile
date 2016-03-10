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
        private final String INSERT = "insert into tbl_salas_reservadas (num_sala,data,"
                                          + "horario, nome_reservou, matricula_reservou) values (?,?,?,?,?);";
        
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
            
            /*
            public static void main(String[] args) throws SQLException {
            
                //Adicionar reserva
                ReservaDAO dao = new ReservaDAO();
            
                reservas r = new reservas();
                r.setNum_sala(102);
                r.setData(0402016);
                r.setHorario("2M");
                r.setNome_reservou("Batman");
                r.setMatricula_reservou("321");
                dao.inserirReserva(r);
                System.out.println(r);
           
            //Consultar todos os registros de acordo com o dia
            //5032016
            //System.out.println(dao.getReservas(5032016));
            
            //Consultar existência de registro
                String horario = "1N";
                int data = 5032016;
                System.out.println(dao.getReservaByHorario(103, data, horario));
    }
     */
}
