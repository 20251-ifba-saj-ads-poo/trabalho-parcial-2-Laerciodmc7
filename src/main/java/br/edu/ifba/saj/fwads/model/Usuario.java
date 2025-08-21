package br.edu.ifba.saj.fwads.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario extends AbstractModel{
    private String nome;
    private String userName;
    private LocalDate dataNascimento;
    private String cpfUsuario;
    private String Senha;
    private ArrayList<Emprestimo> emprestimosPessoais;
    private int id;
    private int limiteEmprestimo;

    public Usuario(String nome, String userName, LocalDate dataNascimento, String cpfUsuario, String senha, ArrayList<Emprestimo> emprestimosPessoais, int id, int limiteEmprestimo) {
        this.nome = nome;
        this.userName = userName;
        this.dataNascimento = dataNascimento;
        this.cpfUsuario = cpfUsuario;
        Senha = senha;
        this.emprestimosPessoais = emprestimosPessoais;
        this.id = id;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public String getNome() {
        return nome;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public ArrayList<Emprestimo> getEmprestimosPessoais() {
        return emprestimosPessoais;
    }

    public int getId() {
        return id;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public void setEmprestimosPessoais(ArrayList<Emprestimo> emprestimosPessoais) {
        this.emprestimosPessoais = emprestimosPessoais;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
}
