package br.edu.ifba.saj.fwads.controller;


import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.model.Emprestimo;
import br.edu.ifba.saj.fwads.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class CadUsuarioController {

    @FXML
    private TextField txNomeCompleto;
    @FXML
    private TextField txUserName;
    @FXML
    private TextField txDataNascimento;
    @FXML
    private TextField txCpf;

    @FXML
    private PasswordField txCriaSenha;
    @FXML
    private PasswordField txConfirmaSenha;

    @FXML
    public void Criar(ActionEvent actionEvent) {
        if(!txCriaSenha.equals(txConfirmaSenha)){
            new Alert(Alert.AlertType.ERROR, "Erro ao inserir senhas").show();
        }

        Usuario newUsuario = new Usuario(txNomeCompleto, txUserName,txDataNascimento,txCpf,txCriaSenha, new ArrayList<>(), 3);
        App.setRoot("/br/edu/ifba/saj/fwads/controller/MenuController.fxml");

    }

    public void cancelar(){
        App.setRoot("/br/edu/ifba/saj/fwads/controller/LoginController.fxml");
    }


}
