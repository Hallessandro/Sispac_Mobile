/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.Visualizar_Reserva;
import br.edu.ifrn.sispac.modelo.reservas;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallessandro
 */
public class ReservaDAO extends GeralDAO{
        private final String INSERT = "insert into tbl_reserva_sala (data_reserva,horario_reserva,"
                                          + "tbl_sala_id_sala, nome_reserva) values (?,?,?,?);";
        
            private final String QUERY_RESERVA = "SELECT nome_reserva, data_reserva, num_sala, horario_reserva FROM tbl_reserva_sala "
                                                + "inner join tbl_sala on tbl_sala.id_sala = tbl_reserva_sala.tbl_sala_id_sala"
                                                + " where data_reserva like ?;"; 
            
            private final String QUERY_RESERVA_PROFESSOR = "select nome_reserva, data_reserva, num_sala, horario_reserva from tbl_reserva_sala "
                                                + "inner join tbl_sala on tbl_sala.id_sala = tbl_reserva_sala.tbl_sala_id_sala "
                                                + "where nome_reserva = ? "                            
                                                + "and data_reserva like ? "
                                                + "order by data_reserva; ";
            private final String QUERY_CONSULTA_RESERVA = "select * from tbl_reserva_sala "
                                                          + "where data_reserva = ? and horario_reserva = ? and tbl_sala_id_sala = ?; ";
            
            public void inserirReserva(reservas r) throws SQLException{
                executarComando(INSERT, r.getData_reserva(),r.getHorario_reserva(), r.getId_sala(), r.getNome_reservou());
            }

            public List<Visualizar_Reserva> getReservasdoDia() throws SQLException{
                Date data = new Date(System.currentTimeMillis());  
                    //SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd/");
                
                ResultSet resultado = executarConsulta(QUERY_RESERVA,data);        
                ArrayList<Visualizar_Reserva> rsvs = new ArrayList<>();
                while (resultado.next()){
                    Visualizar_Reserva r = popularReserva(resultado);
                    rsvs.add(r);
                }
                return rsvs;        
            }
            
            public List<Visualizar_Reserva> getReservas(String data) throws SQLException{
                ResultSet resultado = executarConsulta(QUERY_RESERVA, data);        
                ArrayList<Visualizar_Reserva> rsvs = new ArrayList<>();
                while (resultado.next()){
                    Visualizar_Reserva r = popularReserva(resultado);
                    rsvs.add(r);
                }
                return rsvs;        
            }

            public List<Visualizar_Reserva> getReservasProfessor(String nome, String data) throws SQLException{
                String dataf = "%-" + data + "-%";
                ResultSet resultado = executarConsulta(QUERY_RESERVA_PROFESSOR, nome, dataf);        
                ArrayList<Visualizar_Reserva> rsvs = new ArrayList<>();
                while (resultado.next()){
                    Visualizar_Reserva r = popularReserva(resultado);
                    rsvs.add(r);
                }
                return rsvs;        
            }
            
            private Visualizar_Reserva popularReserva(ResultSet resultado) throws SQLException{
                Visualizar_Reserva r = new Visualizar_Reserva();
                r.setNome(resultado.getString("nome_reserva"));
                Date dataBD = resultado.getDate("data_reserva");
                String dataz = "dd/MM/yyyy";
                SimpleDateFormat formatas = new SimpleDateFormat(dataz);
                String data = formatas.format(dataBD);
                r.setData(data);
                r.setNum_sala(resultado.getString("num_sala"));
                r.setHorario(resultado.getString("horario_reserva"));
                                
                return r;        
            }    
        
            public reservas getReservasByHoario(String data, String horario, int id_sala) throws SQLException{
                ResultSet resultado = executarConsulta(QUERY_CONSULTA_RESERVA, data, horario, id_sala);        
                resultado.next();
                reservas r =  popularReservas(resultado);
                return r;
            }
            
            private reservas popularReservas(ResultSet resultado) throws SQLException{
                reservas r = new reservas();
                r.setNome_reservou(resultado.getString("nome_reserva"));
                r.setData_reserva(resultado.getDate("data_reserva"));
                r.setHorario_reserva(resultado.getString("horario_reserva"));
                r.setId_sala(resultado.getInt("tbl_sala_id_sala"));                
                return r;        
            }    
            
            public static void main(String[] args) {
                   Visualizar_Reserva r = new Visualizar_Reserva();
                   ReservaDAO dao = new ReservaDAO();
            try {
                JOptionPane.showMessageDialog(null, dao.getReservasByHoario("2016-06-24", "13:00 - 14:30", 9));
            } catch (SQLException ex) {
                Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
        }   
}
