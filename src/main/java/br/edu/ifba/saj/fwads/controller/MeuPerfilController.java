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

    public static MeuPerfilController perfilController;
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
    private TextField txConfirmaSenha;

    @FXML
    private Button bntEditar;

    @FXML
    private Button bntCancelar;

    private boolean statusEdicao = false;


    public DatePicker getDpShowDate() {
        return dpShowDate;
    }

    public void setDpShowDate(DatePicker dpShowDate) {
        this.dpShowDate = dpShowDate;
    }

    public TextField getTxShowCPF() {
        return txShowCPF;
    }

    public void setTxShowCPF(TextField txShowCPF) {
        this.txShowCPF = txShowCPF;
    }

    public TextField getTxShowName() {
        return txShowName;
    }

    public void setTxShowName(TextField txShowName) {
        this.txShowName = txShowName;
    }

    public TextField getTxShowSenha() {
        return txShowSenha;
    }

    public void setTxShowSenha(TextField txShowSenha) {
        this.txShowSenha = txShowSenha;
    }

    public TextField getTxShowUserName() {
        return txShowUserName;
    }

    public void setTxShowUserName(TextField txShowUserName) {
        this.txShowUserName = txShowUserName;
    }

    public TextField getTxConfirmaSenha() {
        return txConfirmaSenha;
    }

    public void setTxConfirmaSenha(TextField txConfirmaSenha) {
        this.txConfirmaSenha = txConfirmaSenha;
    }

    public Button getBntEditar() {
        return bntEditar;
    }

    public void setBntEditar(Button bntEditar) {
        this.bntEditar = bntEditar;
    }

    public Button getBntCancelar() {
        return bntCancelar;
    }

    public void setBntCancelar(Button bntCancelar) {
        this.bntCancelar = bntCancelar;
    }

    public boolean getStatusEdicao() {
        return statusEdicao;
    }

    public void setStatusEdicao(boolean statusEdicao) {
        this.statusEdicao = statusEdicao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    Usuario usuario = Biblioteca.getUsuarioLogado();

    @FXML
    public void initialize(){

            txShowName.setText(Biblioteca.getUsuarioLogado().getNome());
            txShowUserName.setText(Biblioteca.getUsuarioLogado().getUserName());
            txShowCPF.setText(Biblioteca.getUsuarioLogado().getCpfUsuario());
            dpShowDate.setValue(Biblioteca.getUsuarioLogado().getDataNascimento());
            txShowSenha.setText(Biblioteca.getUsuarioLogado().getSenha());


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
            }
             else{

                alteraCadastro();

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
      Biblioteca.getUsuarioLogado().setNome(txShowName.getText());
        Biblioteca.getUsuarioLogado().setUserName(txShowUserName.getText());
        Biblioteca.getUsuarioLogado().setCpfUsuario(txShowCPF.getText());
        Biblioteca.getUsuarioLogado().setDataNascimento(dpShowDate.getValue());
        Biblioteca.getUsuarioLogado().setSenha(txShowSenha.getText());

        usuario.setNome(txShowName.getText());

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
