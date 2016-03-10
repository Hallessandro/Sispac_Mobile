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
    int num_sala;
    int data;
    String horario;
    String nome_reservou;
    String matricula_reservou;

    public reservas() {
    }

    public int getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(int num_sala) {
        this.num_sala = num_sala;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNome_reservou() {
        return nome_reservou;
    }

    public void setNome_reservou(String nome_reservou) {
        this.nome_reservou = nome_reservou;
    }

    public String getMatricula_reservou() {
        return matricula_reservou;
    }

    public void setMatricula_reservou(String matricula_reservou) {
        this.matricula_reservou = matricula_reservou;
    }

    @Override
    public String toString() {
        return "reservas{" + "num_sala=" + num_sala + ", data=" + data + ", horario=" + horario + ", nome_reservou=" + nome_reservou + ", matricula_reservou=" + matricula_reservou + '}';
    }
    
    
}
