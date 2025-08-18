package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Autor;
import br.edu.ifba.saj.fwads.model.Categoria;
import br.edu.ifba.saj.fwads.model.Livro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.util.StringConverter;
import java.util.ArrayList;

public class CadLivroController {
    @FXML
    private TextField txTitulo;
    @FXML
    private TextField txSubTitulo;
    @FXML
    private TextField txISBN;
    @FXML
    private ChoiceBox<Autor> slAutor;

    @FXML
    void salvarLivro(ActionEvent event) {

        ArrayList<Categoria> categoriasSelecionadas = new ArrayList<>();

        Livro novoLivro = new Livro(txTitulo.getText(),
                txSubTitulo.getText(),
                txISBN.getText(),
                slAutor.getSelectionModel().getSelectedItem(),
                categoriasSelecionadas);

        new Alert(AlertType.INFORMATION, 
        "Cadastrando Livro(Fake):"+novoLivro.toString()).showAndWait();
        limparTela();
      

    }

    @FXML 
    private void initialize() {
        slAutor.setConverter(new StringConverter<Autor>() {
            @Override
            public String toString(Autor obj) {
                if (obj != null) {
                    return obj.getNome() + ":" + obj.getEmail();
                }
                return "";
            }

            @Override
            public Autor fromString(String stringAutor) {
                return Biblioteca.listaAutores
                    .stream()
                    .filter(autor -> stringAutor.equals(autor.getNome() + ":" + autor.getEmail()))
                    .findAny()
                    .orElse(null);                
            }
        });
        
        carregarListaAutores();
    }

    @FXML
    private void limparTela() {
        txTitulo.setText("");
        txSubTitulo.setText("");
        txISBN.setText("");
        //Todo REVER
        slAutor.setSelectionModel(null);
    }

    private void carregarListaAutores() {
        slAutor.setItems(Biblioteca.listaAutores);
    }

}
