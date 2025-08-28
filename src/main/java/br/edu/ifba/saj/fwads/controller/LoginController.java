/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

package br.edu.ifba.saj.fwads.controller;


import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.Biblioteca;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private PasswordField txSenha;

    @FXML
    private TextField txUsuario;

    @FXML
    private Hyperlink txCadUsuario;

    @FXML
    public void entrar() {
        if ((txUsuario.getText().equals(Biblioteca.getUsuarioLogado().getUserName()) || txSenha.getText().equals(Biblioteca.getUsuarioLogado().getSenha())) || txUsuario.getText().equals("")) {
            new Alert(AlertType.INFORMATION, "Usuário e senha corretos").showAndWait();
            App.setRoot("controller/Master.fxml");
        } else {
            new Alert(AlertType.ERROR, "Usuário ou senha inválidos").show();
        }
    }

    @FXML
    public void limparCampos(ActionEvent event) {
        txUsuario.setText("");
        txSenha.setText("");
    }

    @FXML
    public void carregaTelaCadastro() { //metodo que carrega a tela de cadastro
            App.setRoot("controller/CadUsuario.fxml");
    }

}