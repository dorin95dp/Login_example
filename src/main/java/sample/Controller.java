package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private TextField textField1;

    public void printSomething() {
        System.out.println("method print something works");
        label1.setText("Jora");
        textField1.setText("Grisha");
    }

    public void setLabel2() {
        label2.setText(textField1.getText());
    }
}
