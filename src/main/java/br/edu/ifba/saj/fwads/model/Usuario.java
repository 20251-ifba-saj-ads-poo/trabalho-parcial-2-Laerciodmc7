package br.edu.ifba.saj.fwads.model;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.UUID;

public class Usuario extends AbstractModel<UUID>{
    private TextField nome;
    private TextField userName;
    private TextField dataNascimento;
    private TextField cpfUsuario;
    private TextField Senha;
    private ArrayList<Emprestimo> emprestimosPessoais;
    private int id;
    private int limiteEmprestimo;

    public Usuario(TextField nome, TextField userName, TextField dataNascimento, TextField cpfUsuario, TextField senha, ArrayList<Emprestimo> emprestimosPessoais, int limiteEmprestimo) {
        this.nome = nome;
        this.userName = userName;
        this.dataNascimento = dataNascimento;
        this.cpfUsuario = cpfUsuario;
        this.Senha = senha;
        this.emprestimosPessoais = emprestimosPessoais;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public TextField getNome() {
        return nome;
    }

    public TextField getUserName() {
        return userName;
    }

    public TextField getDataNascimento() {
        return dataNascimento;
    }

    public TextField getCpfUsuario() {
        return cpfUsuario;
    }

    public TextField getSenha() {
        return Senha;
    }

    public ArrayList<Emprestimo> getEmprestimosPessoais() {
        return emprestimosPessoais;
    }


    public int getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setNome(TextField nome) {
        this.nome = nome;
    }

    public void setUserName(TextField userName) {
        this.userName = userName;
    }

    public void setDataNascimento(TextField dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpfUsuario(TextField cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public void setSenha(TextField senha) {
        Senha = senha;
    }

    public void setEmprestimosPessoais(ArrayList<Emprestimo> emprestimosPessoais) {
        this.emprestimosPessoais = emprestimosPessoais;
    }

    public void setLimiteEmprestimo(int limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
}
