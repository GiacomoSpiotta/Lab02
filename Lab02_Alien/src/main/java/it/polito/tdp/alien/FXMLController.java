package it.polito.tdp.alien;

import it.polito.tdp.alien.model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	AlienDictionary dizionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtparola;

    @FXML
    private TextArea txtarea;

    @FXML
    void doClear(ActionEvent event) {
    	this.txtarea.clear();
    	dizionario.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String s = txtparola.getText();
    	
    	if(s.contains(" ") && s.matches("(.*)[a-z](.*)")) {
    		String[] words = s.split(" ");
    		dizionario.addWord(words[0].toLowerCase(), words[1].toLowerCase());
    		txtarea.setText(words[0]+" "+words[1]);
    	}else if(!s.contains(" ")) {
    		String[] words = s.split(" ");
    		txtarea.setText(words[0]+" "+dizionario.translate(words[0]));
    	}
    }

    @FXML
    void initialize() {
        assert txtparola != null : "fx:id=\"txtparola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtarea != null : "fx:id=\"txtarea\" was not injected: check your FXML file 'Scene.fxml'.";
    }
}
