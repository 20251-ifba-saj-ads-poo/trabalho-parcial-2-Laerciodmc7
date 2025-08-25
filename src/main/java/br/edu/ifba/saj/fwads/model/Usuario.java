package br.edu.ifba.saj.fwads.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Usuario extends AbstractModel<UUID>{
    private String nome;
    private String userName;
    private LocalDate dataNascimento;
    private String cpfUsuario;
    private String Senha;
    private ArrayList<Emprestimo> emprestimosPessoais;
    private int limiteEmprestimo;

    public Usuario(String nome, String userName, LocalDate dataNascimento, String cpfUsuario, String senha, ArrayList<Emprestimo> emprestimosPessoais, int limiteEmprestimo) {
        this.nome = nome;
        this.userName = userName;
        this.dataNascimento = dataNascimento;
        this.cpfUsuario = cpfUsuario;
        this.Senha = senha;
        this.emprestimosPessoais = emprestimosPessoais;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public ArrayList<Emprestimo> getEmprestimosPessoais() {
        return emprestimosPessoais;
    }

    public void setEmprestimosPessoais(ArrayList<Emprestimo> emprestimosPessoais) {
        this.emprestimosPessoais = emprestimosPessoais;
    }

    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
}
