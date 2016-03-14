/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.dao;

import br.edu.ifrn.sispac.modelo.Sala;
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
public class SalasDAO extends GeralDAO{
    
    private final String INSERT = "insert into tbl_sala (num_sala) values (?);";
    
    private final String DELETE = "delete from tbl_sala where num_sala = ?;";
    
    private final String UPDATE = "update tbl_sala set num_sala=? where num_sala = ?;";
    
    private final String QUERY_SALAS = "select num_sala from tbl_sala"; 
    
    public void inserirSala(Sala sala) throws SQLException{
        executarComando(INSERT, sala.getNum_sala());
    }
    
    public void excluirSala(String num_sala) throws SQLException{
        executarComando(DELETE, num_sala);
    }
    
    public void atualizarSala(Sala sala) throws SQLException{
        executarComando(UPDATE, sala.getNum_sala());
    }
    
    public List<Sala> getSalas() throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_SALAS);        
        ArrayList<Sala> salas = new ArrayList();
        while (resultado.next()){
            Sala sala = popularSala(resultado);
            salas.add(sala);
        }
        return salas;        
    }
    
    private Sala popularSala(ResultSet resultado) throws SQLException{
        Sala sala = new Sala();
        sala.setNum_sala(resultado.getString("num_sala"));
        return sala;        
    }
 
}
