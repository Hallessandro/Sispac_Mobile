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
public class Usuario {

    int id_usuario;
    String matricula;
    String nome;
    int nv_acesso;
    String senha;
    
    public Usuario() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNv_acesso() {
        return nv_acesso;
    }

    public void setNv_acesso(int nv_acesso) {
        this.nv_acesso = nv_acesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", matricula=" + matricula + ", nome=" + nome + ", nv_acesso=" + nv_acesso + ", senha=" + senha + '}';
    }

    

    
    
    
}
