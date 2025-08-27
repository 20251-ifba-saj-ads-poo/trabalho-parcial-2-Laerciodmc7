package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;
import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class MeuPerfilController {

    @FXML
    private DatePicker dpShowDate;

    @FXML
    private TextField txShowCPF;

    @FXML
    private TextField txShowName;

    @FXML
    private TextField txShowSenha;

    @FXML
    private TextField txShowUserName;

    @FXML
    private Button bntEditar;

    @FXML
    private Button bntCancelar;

    private boolean statusEdicao = false;

    public boolean getStatusEdicao(){
        return this.statusEdicao;
    }

    public void setStatusEdicao(boolean statusEdicao){
        this.statusEdicao = statusEdicao;
    }

    Usuario usuario = Biblioteca.getUsuarioLogado();

    @FXML
    public void initialize(){


            txShowName.setText(usuario.getNome());
            txShowUserName.setText(usuario.getUserName());
            txShowCPF.setText(usuario.getCpfUsuario());
            dpShowDate.setValue(usuario.getDataNascimento());
            txShowSenha.setText(usuario.getSenha());

    }

    @FXML
    public void editarPerfil(ActionEvent event){
            if(!getStatusEdicao()) {
                setStatusEdicao(true);
                bntEditar.setText("Salvar");
                txShowName.setEditable(true);
                txShowUserName.setEditable(true);
                txShowCPF.setEditable(true);
                dpShowDate.setDisable(false);
                txShowSenha.setEditable(true);

                alteraCadastro();
            }
             else{
                bntEditar.setText("Editar");
                setStatusEdicao(false);
                txShowName.setEditable(false);
                txShowUserName.setEditable(false);
                txShowCPF.setEditable(false);
                dpShowDate.setDisable(true);
                txShowSenha.setEditable(false);
            }
    }

    @FXML
    private void alteraCadastro(){
        usuario.setNome(txShowName.getText());
        usuario.setUserName(txShowUserName.getText());
        usuario.setCpfUsuario(txShowCPF.getText());
        usuario.setDataNascimento(dpShowDate.getValue());
        usuario.setSenha(txShowSenha.getText());

    }


    @FXML
    public void cancelarEdicao(){
        bntEditar.setText("Editar");
        setStatusEdicao(false);
        txShowName.setEditable(false);
        txShowUserName.setEditable(false);
        txShowCPF.setEditable(false);
        dpShowDate.setDisable(true);
        txShowSenha.setEditable(false);

    }

    @FXML
    private void voltarMenu(){
        App.setRoot("controller/Master.fxml");
    }


}
