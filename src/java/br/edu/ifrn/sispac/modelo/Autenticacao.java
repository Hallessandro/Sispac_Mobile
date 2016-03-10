/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sispac.modelo;

import java.io.Serializable;

/**
 *
 * @author Hallessandro
 */
public class Autenticacao implements Serializable{
    
    String matricula;
    String nome;
    String senha;

    public Autenticacao() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autenticacao{" + "matricula=" + matricula + ", nome=" + nome + ", senha=" + senha + '}';
    }

    
    
    
}
