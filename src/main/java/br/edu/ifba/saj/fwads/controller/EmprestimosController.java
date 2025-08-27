package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class EmprestimosController {

    @FXML
    private TableColumn<?, ?> ColunaAutor;

    @FXML
    private TableColumn<?, ?> ColunaCategoria;

    @FXML
    private TableColumn<?, ?> ColunaDataDevolucao;

    @FXML
    private TableColumn<?, ?> ColunaDataEmprestimo;

    @FXML
    private TableColumn<?, ?> ColunaID;

    @FXML
    private TableColumn<?, ?> ColunaIdEmprestimo;

    @FXML
    private TableColumn<?, ?> ColunaLancamento;

    @FXML
    private TableColumn<?, ?> ColunaLivro;

    @FXML
    private TableColumn<?, ?> ColunaPaginas;

    @FXML
    private TableColumn<?, ?> ColunaStatus;

    @FXML
    private TableColumn<?, ?> ColunaTitulo;

    @FXML
    private Button bntHome;

    @FXML
    private Button bntMeuPerfil;

    @FXML
    private Button bntMeusEmprestimos;

    @FXML
    private Button bntSair;

    @FXML
    private Button bntSistema;


    @FXML
    void showHome(ActionEvent event) {
        App.setRoot("controller/Master.fxml");
    }

    @FXML
    void showMeuPerfil(ActionEvent event) {
        App.setRoot("controller/MeuPerfil.fxml");
    }

    @FXML
    void voltarTelaLogin(ActionEvent event) {
        App.setRoot("controller/Login.fxml");
    }

    public void showInformaçõesDoSistema(ActionEvent event) {
    }

    public void showEmprestimos(ActionEvent event) {

    }
}
