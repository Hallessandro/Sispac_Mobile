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
public class Professor extends Usuario{
    
    String matricula_professor;
    String nome_professor;
    String senha;

    public Professor() {
    }

    public String getMatricula_professor() {
        return matricula_professor;
    }

    public void setMatricula_professor(String matricula_professor) {
        this.matricula_professor = matricula_professor;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Professor{" + "matricula_professor=" + matricula_professor + ", nome_professor=" + nome_professor + ", senha=" + senha + '}';
    }

    
    
    
}
