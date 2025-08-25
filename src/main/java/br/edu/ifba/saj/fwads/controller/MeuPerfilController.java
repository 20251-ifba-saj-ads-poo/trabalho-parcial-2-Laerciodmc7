package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Usuario;
import javafx.fxml.FXML;
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
    public void initialize(){
        Usuario usuario = Biblioteca.getUsuarioLogado();

            txShowName.setText(usuario.getNome());
            txShowUserName.setText(usuario.getUserName());
            txShowCPF.setText(usuario.getCpfUsuario());
            dpShowDate.setValue(usuario.getDataNascimento());
            txShowSenha.setText(usuario.getSenha());

    }




}
