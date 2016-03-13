package br.edu.ifrn.sispac.dao;


import br.edu.ifrn.sispac.dao.GeralDAO;
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
    
    public Usuario getUsuarioByMatricula(String matricula, String senha) throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_USUARIO_BY_MATRICULA, matricula, senha);        
        resultado.next();
        Usuario u =  popularUsuario(resultado);
        return u;
    }
    
    private Usuario popularUsuario(ResultSet resultado) throws SQLException{
        Usuario u = new Usuario();
        u.setNome(resultado.getString("nome_usuario"));
        u.setMatricula(resultado.getString("matricula_usuario"));
        u.setNv_acesso(resultado.getInt(("nv_acesso")));
        u.setSenha(resultado.getString("senha"));
        return u;        
    }
    
}
