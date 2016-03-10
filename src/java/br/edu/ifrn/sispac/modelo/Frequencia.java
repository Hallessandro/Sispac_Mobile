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
public class Frequencia {
    String data;
    String horario;
    String num_sala;
    String nome_professor;
    String matricula_professor;

    public Frequencia() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getMatricula_professor() {
        return matricula_professor;
    }

    public void setMatricula_professor(String matricula_professor) {
        this.matricula_professor = matricula_professor;
    }

    @Override
    public String toString() {
        return "Frequencia{" + "data=" + data + ", horario=" + horario + ", num_sala=" + num_sala + ", nome_professor=" + nome_professor + ", matricula_professor=" + matricula_professor + '}';
    }
    
    
}
