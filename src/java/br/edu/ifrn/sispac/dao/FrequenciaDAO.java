/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.Frequencia;
import br.edu.ifrn.sispac.modelo.Visualizar_Frequencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallessandro
 */

public class FrequenciaDAO extends GeralDAO {
    
    private final String INSERT = "insert into tbl_registro_frequencia (horario,"
                                  + "tbl_sala_id_sala, tbl_professor_id_professor, "
                                  + "tbl_usuario_id_usuario, data) values (?,?,?,?,?);";
            
            private final String QUERY_FREQUENCIA = "select nome_professor, horario, data "
                                                    + "from tbl_registro_frequencia inner join tbl_professor "
                                                    + "on tbl_registro_frequencia.tbl_professor_id_professor = tbl_professor.id_professor "                                
                                                    + "where tbl_registro_frequencia.tbl_professor_id_professor = ? "
                                                    + "and data like ? "
                                                    + "order by data; ";
            
            /*
            private final String QUERY_FREQUENCIA = "select * from tbl_registro_frequencia "
                                                            + "where tbl_professor_id_professor = ? "                                
                                                            + "and data like ?"
                                                            + "order by data; ";
            */
            
            public void inserirFrequencia(Frequencia f) throws SQLException{
                        executarComando(INSERT, f.getHorario(), f.getId_sala(), f.getId_professor(), f.getId_usuario(), f.getData());
                    }

            public List<Visualizar_Frequencia> getFrequencias(int id_professor, String data) throws SQLException{
                String dataf = "%-" + data + "-%";
                ResultSet resultado = executarConsulta(QUERY_FREQUENCIA, id_professor, dataf);        
                ArrayList<Visualizar_Frequencia> frequencias = new ArrayList<>();
                while (resultado.next()){
                    Visualizar_Frequencia vf = popularFrequencia(resultado);
                    JOptionPane.showMessageDialog(null, vf);
                    frequencias.add(vf);
                }
                return frequencias;        
            }

            private Visualizar_Frequencia popularFrequencia(ResultSet resultado) throws SQLException{
                Visualizar_Frequencia vf = new Visualizar_Frequencia();
                vf.setNome_professor(resultado.getString("nome_professor"));
                vf.setHorario(resultado.getString("horario"));
                vf.setData(resultado.getString("data"));
                
                return vf;        
            }   
            
            public static void main(String[] args) {
                FrequenciaDAO dao = new FrequenciaDAO();
            try {
                dao.getFrequencias(6, "03");
            } catch (SQLException ex) {
                Logger.getLogger(FrequenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
