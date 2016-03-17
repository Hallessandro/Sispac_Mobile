/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.Frequencia;
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
    
    
            private final String QUERY_FREQUENCIA = "select * from tbl_registro_frequencia "
                                                    + "where tbl_professor_id_professor = ? "                                
                                                    + "and data like ?; ";
                                              
            public void inserirFrequencia(Frequencia f) throws SQLException{
                        executarComando(INSERT, f.getHorario(), f.getId_sala(), f.getId_professor(), f.getId_usuario(), f.getData());
                    }

            public List<Frequencia> getFrequencias(int id_professor, String data) throws SQLException{
                String dataf = "%-" + data + "-%";
                ResultSet resultado = executarConsulta(QUERY_FREQUENCIA, id_professor, dataf);        
                ArrayList<Frequencia> frequencias = new ArrayList<>();
                while (resultado.next()){
                    Frequencia frequencia = popularFrequencia(resultado);
                    frequencias.add(frequencia);
                }
                return frequencias;        
            }

            private Frequencia popularFrequencia(ResultSet resultado) throws SQLException{
                
                Frequencia f = new Frequencia();
                f.setHorario(resultado.getString("horario"));
                f.setId_sala(resultado.getInt("tbl_sala_id_sala"));
                f.setId_professor(resultado.getInt("tbl_professor_id_professor"));
                f.setId_usuario(resultado.getInt("tbl_usuario_id_usuario"));
                f.setData(resultado.getString("data"));
                
                return f;        
            }   
            
            
}
