/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.Professor;
import java.sql.PreparedStatement;
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
public class ProfessorDAO extends GeralDAO{
    
    private final String QUERY_PROFESSOR_BY_MATRICULA = "select id_professor, nome_professor from tbl_professor "
                                                        + "where nome_professor like ? ;";
    
     public List<Professor> getProfessor(String find) throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_PROFESSOR_BY_MATRICULA, find+"%");        
        ArrayList<Professor> professores = new ArrayList();
        while (resultado.next()){
            Professor p = popularProfessor(resultado);
            professores.add(p);
        }
        return professores;        
    }
    
    private Professor popularProfessor(ResultSet resultado) throws SQLException{
        Professor p = new Professor();
        p.setNome_professor(resultado.getString("nome_professor"));
        return p;        
    }
}
