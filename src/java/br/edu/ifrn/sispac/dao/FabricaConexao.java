/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hallessandro
 */
public class FabricaConexao {
    public static Connection getConexao() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3307/sispac", "root", "SAMEmistake");
    }
    
    public static void fecharConexao(Connection con) throws SQLException{
        con.close();
    }
}
