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

/**
 *
 * @author Hallessandro
 */

public class FrequenciaDAO extends GeralDAO {
    
    private final String INSERT = "insert into frequencia (data,"
                                          + "horario, num_sala, nome_professor, matricula_professor) values (?,?,?,?,?);";
    
    //Atualmente essa busca vai ser meio confusa, mas depois de ter a data devidamente formatada
    //ela fara mais sentindo, pois like poderá ser algo como %/?/% 
    
            private final String QUERY_FREQUENCIA = "select * from frequencia "
                                                    + "where matricula_professor = ? "                                
                                                    + "and data like ?; ";
                                              
            public void inserirFrequencia(Frequencia f) throws SQLException{
                        executarComando(INSERT, f.getData(),f.getHorario(), f.getNum_sala(), f.getNome_professor(), f.getMatricula_professor());
                    }

            public List<Frequencia> getFrequencias(String matricula, String data) throws SQLException{
                String dataf = "%/" + data + "/%";
                ResultSet resultado = executarConsulta(QUERY_FREQUENCIA, matricula, dataf);        
                ArrayList<Frequencia> frequencias = new ArrayList<>();
                while (resultado.next()){
                    Frequencia frequencia = popularFrequencia(resultado);
                    frequencias.add(frequencia);
                }
                return frequencias;        
            }

            private Frequencia popularFrequencia(ResultSet resultado) throws SQLException{
                
                Frequencia f = new Frequencia();
                
                f.setData(resultado.getString("data"));
                f.setHorario(resultado.getString("horario"));
                f.setNum_sala(resultado.getString("num_sala"));
                f.setNome_professor(resultado.getString("nome_professor"));
                f.setMatricula_professor(resultado.getString("matricula_professor"));
                
                return f;        
            }    
        /*
            public static void main(String[] args) throws SQLException {
                //Adicionar frequência
                
                FrequenciaDAO dao = new FrequenciaDAO();
                
                
                Frequencia f = new Frequencia();
                f.setData("05/03/2016");
                f.setHorario("2M");
                f.setNum_sala("A101");
                f.setNome_professor("Batman");
                f.setMatricula_professor("123");
                
                dao.inserirFrequencia(f);
                System.out.println(f);
                
                
                String data = "03";
                String dataX = "%/" + data + "/%"; 
                String mat = "123";
                //System.out.println(dataX);
                System.out.println(dao.getFrequencias(mat, dataX));
                
        }
        */
}
