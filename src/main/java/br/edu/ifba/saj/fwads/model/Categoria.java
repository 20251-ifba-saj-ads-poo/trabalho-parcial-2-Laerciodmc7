package br.edu.ifba.saj.fwads.model;

import java.util.UUID;

public class Categoria extends AbstractModel<UUID> {
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
