/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GeralDAO {
    public void executarComando(String sql,Object...parametros) throws SQLException{
        Connection con = null;
        try {
            con = FabricaConexao.getConexao();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GeralDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        PreparedStatement comando = con.prepareStatement(sql);
        for (int i=1;i<=parametros.length;i++){
            comando.setObject(i, parametros[i-1]);
        }
        comando.executeUpdate();
        //FabricaConexao.fecharConexao(con);        
    }
    
    public ResultSet executarConsulta(String sql,Object...parametros) throws SQLException{
        Connection con = null;
        try {
            con = FabricaConexao.getConexao();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GeralDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        PreparedStatement comando = con.prepareStatement(sql);
        for (int i=1;i<=parametros.length;i++){
            comando.setObject(i, parametros[i-1]);
        }
        ResultSet resultado =  comando.executeQuery();
        //FabricaConexao.fecharConexao(con);  
        return resultado;
    }
}
