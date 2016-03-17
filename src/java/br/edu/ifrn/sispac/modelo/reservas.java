/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.modelo;

/**
 *
 * @author Hallessandro
 */
public class reservas{
    
    String data_reserva;
    String horario_reserva;
    int id_usuario;
    int id_sala;

    public reservas() {
    }

    public String getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(String data_reserva) {
        this.data_reserva = data_reserva;
    }

    public String getHorario_reserva() {
        return horario_reserva;
    }

    public void setHorario_reserva(String horario_reserva) {
        this.horario_reserva = horario_reserva;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    @Override
    public String toString() {
        return "reservas{" + "data_reserva=" + data_reserva + ", horario_reserva=" + horario_reserva + ", id_usuario=" + id_usuario + ", id_sala=" + id_sala + '}';
    }

}
