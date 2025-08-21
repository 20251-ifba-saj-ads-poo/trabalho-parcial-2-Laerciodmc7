package br.edu.ifba.saj.fwads.model;

import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDate;

public class Autor extends AbstractModel<UUID>{
   private String nomeAutor;
   private LocalDate dataNascimento;
   private ArrayList<Livro> livrosDisponiveis;

    public Autor(String nomeAutor, LocalDate dataNascimento, ArrayList<Livro> livrosDisponiveis) {
        this.nomeAutor = nomeAutor;
        this.dataNascimento = dataNascimento;
        this.livrosDisponiveis = livrosDisponiveis;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public void setLivrosDisponiveis(ArrayList<Livro> livrosDisponiveis) {
        this.livrosDisponiveis = livrosDisponiveis;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nomeAutor='" + nomeAutor + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", livrosDisponiveis=" + livrosDisponiveis +
                '}';
    }
}
