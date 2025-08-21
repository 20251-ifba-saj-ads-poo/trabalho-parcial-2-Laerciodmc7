package br.edu.ifba.saj.fwads.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;


public class Livro extends AbstractModel<UUID>{
    private String nomeLivro;
    private Autor autorLivro;
    private LocalDate dataLancamento;
    private int qntPaginas;
    private ArrayList<Categoria> categoriaLivro;

    public Livro(String nomeLivro, Autor autorLivro, LocalDate dataLancamento, int qntPaginas, ArrayList<Categoria> categoriaLivro) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.dataLancamento = dataLancamento;
        this.qntPaginas = qntPaginas;
        this.categoriaLivro = categoriaLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Autor getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    public ArrayList<Categoria> getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(ArrayList<Categoria> categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", autorLivro=" + autorLivro +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", qntPaginas=" + qntPaginas +
                ", categoriaLivro=" + categoriaLivro +
                '}';
    }
}
