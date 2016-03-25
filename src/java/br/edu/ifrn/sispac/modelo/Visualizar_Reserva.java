/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.modelo;

import java.util.Date;

/**
 *
 * @author Hallessandro
 */
public class Visualizar_Reserva {
    
    String nome;
    String data;
    String num_sala;
    String horario;

    public Visualizar_Reserva() {
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    public String getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Visualizar_Reserva{" + "nome=" + nome + ", data=" + data + ", num_sala=" + num_sala + ", horario=" + horario + '}';
    }

    
}
