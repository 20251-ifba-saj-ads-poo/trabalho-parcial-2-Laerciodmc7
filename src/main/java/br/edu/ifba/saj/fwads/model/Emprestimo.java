package br.edu.ifba.saj.fwads.model;

import java.time.LocalDate;
import java.util.UUID;

public class Emprestimo extends AbstractModel<UUID>{
    private Usuario usuario;
    private int idEmprestimo;
    private Livro livroEmprestado;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolução;
    private String statusEmprestimo;

    public Emprestimo(Usuario usuario, int idEmprestimo, Livro livroEmprestado, LocalDate dataEmprestimo, LocalDate dataDevolução, String statusEmprestimo) {
        this.usuario = usuario;
        this.idEmprestimo = idEmprestimo;
        this.livroEmprestado = livroEmprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolução = dataDevolução;
        this.statusEmprestimo = statusEmprestimo;
    }

    public LocalDate getDataDevolução() {
        return dataDevolução;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public void setLivroEmprestado(Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolução(LocalDate dataDevolução) {
        this.dataDevolução = dataDevolução;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }
}
