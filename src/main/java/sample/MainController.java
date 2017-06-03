package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

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
