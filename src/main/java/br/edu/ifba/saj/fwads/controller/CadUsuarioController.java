package br.edu.ifba.saj.fwads.controller;


import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.ArrayList;


public class CadUsuarioController {

    @FXML
    private TextField txNomeCompleto;
    @FXML
    private TextField txUserName;
    @FXML
    private DatePicker dpDataNascimento;
    @FXML
    private TextField txCpf;

    @FXML
    private PasswordField txCriaSenha;
    @FXML
    private PasswordField txConfirmaSenha;

    private Usuario novoUsuario;

    public Usuario getUsuarioCadastrado(){
        return novoUsuario;
    }


    @FXML
    public void Criar(ActionEvent event) {
        if(!txCriaSenha.getText().equals(txConfirmaSenha.getText()) || txCriaSenha.getText().equals("")){
            new Alert(Alert.AlertType.ERROR, "Erro ao inserir senhas").show();
        }
    else {
            novoUsuario = new Usuario(txNomeCompleto.getText(), txUserName.getText(), dpDataNascimento.getValue(), txCpf.getText(), txCriaSenha.getText(), new ArrayList<>(), 3);
            Biblioteca.setUsuarioLogado(novoUsuario);
            new Alert(Alert.AlertType.INFORMATION, "Usuário criado com sucesso").showAndWait();
            App.setRoot("/br/edu/ifba/saj/fwads/controller/Master.fxml");
        }
    }

    public void cancelar(ActionEvent event){
        App.setRoot("resources/br/edu/ifba/saj/fwads/controller/Login.fxml");
    }

}
