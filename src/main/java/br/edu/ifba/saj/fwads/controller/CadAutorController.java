package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Autor;
import br.edu.ifba.saj.fwads.model.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.util.ArrayList;

public class CadAutorController {

    @FXML
    private TextField txCPF;

    @FXML
    private TextField txEmail;

    @FXML
    private TextField txNome;

    @FXML
    private void salvarAutor() {

        ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
        Autor novoAutor = new Autor(txNome.getText(),
                    txEmail.getText(), 
                    txCPF.getText(), livrosDisponiveis);
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Autor:"+novoAutor.getNome()).showAndWait();
        Biblioteca.listaAutores.add(novoAutor);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txNome.setText("");
        txEmail.setText("");
        txCPF.setText("");
    }

}
