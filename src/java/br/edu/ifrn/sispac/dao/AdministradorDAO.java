/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.Professor;
import br.edu.ifrn.sispac.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hallessandro
 */
public class AdministradorDAO extends GeralDAO{
    
    private final String INSERT_USUARIO = "insert into tbl_usuario (nome_usuario, matricula_usuario, nv_acesso, senha) values (?,?,?,?);";
    
    private final String INSERT_PROFESSOR = "insert into tbl_professor (matricula_professor,nome_professor, senha) values (?,?,?);";
    
    private final String UPDATE_SENHA = //"SET SQL_SAFE_UPDATES = 0; Desabilita o safe mode"
                                        "update tbl_usuario set senha=? where matricula_usuario=?;";
    
    private final String UPDATE_SENHA_PROFESSOR = //"SET SQL_SAFE_UPDATES = 0; Desabilita o safe mode"
                                        "update tbl_professor set senha=? where matricula_professor=?;";

    private final String QUERY_PROFESSOR = "select id_professor, nome_professor from tbl_professor";

    private final String QUERY_USUARIO = "select id_usuario from tbl_usuario where matricula_usuario = ?";
    
    public void inserirProfessor(Professor p) throws SQLException{
                        executarComando(INSERT_PROFESSOR, p.getMatricula_professor(), p.getNome_professor(), p.getSenha());
                    }
                    
    public void inserirUsuario(Usuario u) throws SQLException{
                        executarComando(INSERT_USUARIO, u.getNome(), u.getMatricula(), u.getNv_acesso(), u.getSenha());
                    }
    public void alterarSenha(String senha, String matricula) throws SQLException{
        executarComando(UPDATE_SENHA, senha, matricula);
    }
    public void alterarSenhaProfessor(String senha, String matricula) throws SQLException{
        executarComando(UPDATE_SENHA_PROFESSOR, senha, matricula);
    }
    
    public List<Professor> getProfessor() throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_PROFESSOR);        
        ArrayList<Professor> professores = new ArrayList();
        while (resultado.next()){
            Professor p = popularProfessor(resultado);
            professores.add(p);
        }
        return professores;        
    }
    
    private Professor popularProfessor(ResultSet resultado) throws SQLException{
        Professor p = new Professor();
        p.setId_professor(resultado.getInt("id_professor"));
        p.setNome_professor(resultado.getString("nome_professor"));
        return p;        
    }
    
    public int getUsuarioByMatricula(String matricula) throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_USUARIO, matricula);        
        resultado.next();
        Usuario u =  popularUsuario(resultado);
        return u.getId_usuario();
    }
    
    private Usuario popularUsuario(ResultSet resultado) throws SQLException{
        Usuario u = new Usuario();
        u.setId_usuario(resultado.getInt("id_usuario"));
        return u;        
    }
    
}
