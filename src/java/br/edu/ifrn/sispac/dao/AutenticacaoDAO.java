package br.edu.ifrn.sispac.dao;


import br.edu.ifrn.sispac.dao.GeralDAO;
import br.edu.ifrn.sispac.modelo.Autenticacao;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    private final String QUERY_USUARIO_BY_MATRICULA = "select * from usuarios where matricula_usuario = ? and senha = ?;";
    
    public Autenticacao getUsuarioByMatricula(String matricula, String senha) throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_USUARIO_BY_MATRICULA, matricula, senha);        
        resultado.next();
        Autenticacao a = popularUsuario(resultado);
        return a;
    }
    
    private Autenticacao popularUsuario(ResultSet resultado) throws SQLException{
        Autenticacao a = new Autenticacao();
        a.setMatricula(resultado.getString("matricula_usuario"));
        a.setNome(resultado.getString("nome_usuario"));
        a.setSenha(resultado.getString("senha"));
        return a;        
    }
    
}
