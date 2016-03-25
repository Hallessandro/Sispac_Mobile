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
public class reservas{
    
    Date data_reserva;
    String horario_reserva;
    String nome_reservou;
    int id_sala;

    public reservas() {
    }

    public Date getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(Date data_reserva) {
        this.data_reserva = data_reserva;
    }


    public String getHorario_reserva() {
        return horario_reserva;
    }

    public void setHorario_reserva(String horario_reserva) {
        this.horario_reserva = horario_reserva;
    }

    public String getNome_reservou() {
        return nome_reservou;
    }

    public void setNome_reservou(String nome_reservou) {
        this.nome_reservou = nome_reservou;
    }

    

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    @Override
    public String toString() {
        return "reservas{" + "data_reserva=" + data_reserva + ", horario_reserva=" + horario_reserva + ", nome_reservou=" + nome_reservou + ", id_sala=" + id_sala + '}';
    }
    

}
