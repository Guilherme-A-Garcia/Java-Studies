import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

// Since we cannot add an onAction event to the ChoiceBox, we'll have to implement the Initializable interface
public class JFXClass15Controller implements Initializable{
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private Label label1;
    
    private String[] choices = {"option1", "option2", "option3"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        choiceBox.getItems().addAll(choices);
        choiceBox.setOnAction(this::getOption);  // "this::" is a method reference operator, we're referencing
                                                 // getOption and linking it to the choiceBox node.
    }

    public void getOption(ActionEvent event){
        String option = choiceBox.getValue();
        label1.setText(option);
    }
}
