package br.com.fiap.colecoes;

import java.sql.ClientInfoStatus;

public class Cliente {

    private String nome;

    public Cliente(){

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
