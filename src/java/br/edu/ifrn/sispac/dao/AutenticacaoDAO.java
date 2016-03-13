package br.edu.ifrn.sispac.dao;


import br.edu.ifrn.sispac.dao.GeralDAO;
import br.edu.ifrn.sispac.modelo.Professor;
//import br.edu.ifrn.sispac.modelo.Autenticacao;
import br.edu.ifrn.sispac.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallessandro
 */
public class AutenticacaoDAO extends GeralDAO{
    
    private final String QUERY_USUARIO_BY_MATRICULA = "select * from tbl_usuario where matricula_usuario = ? and senha = ?;";
    
    private final String QUERY_PROFESSOR_BY_MATRICULA = "select * from tbl_professor where matricula_professor = ? and senha = ?;";
    
    public Usuario getUsuarioByMatricula(String matricula, String senha) throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_USUARIO_BY_MATRICULA, matricula, senha);        
        resultado.next();
        Usuario u =  popularUsuario(resultado);
        return u;
    }
    
    public Professor getProfessorByMatricula(String matricula, String senha) throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_PROFESSOR_BY_MATRICULA, matricula, senha);        
        resultado.next();
        Professor p =  popularProfessor(resultado);
        return p;
    }
    
    private Usuario popularUsuario(ResultSet resultado) throws SQLException{
        Usuario u = new Usuario();
        u.setNome(resultado.getString("nome_usuario"));
        u.setMatricula(resultado.getString("matricula_usuario"));
        u.setNv_acesso(resultado.getInt(("nv_acesso")));
        u.setSenha(resultado.getString("senha"));
        return u;        
    }
    
    private Professor popularProfessor(ResultSet resultado) throws SQLException{
        Professor p = new Professor();
        p.setMatricula_professor(resultado.getString("matricula_professor"));
        p.setNome_professor(resultado.getString("nome_professor"));
        p.setSenha(resultado.getString("senha"));
        return p;        
    }
    
}
