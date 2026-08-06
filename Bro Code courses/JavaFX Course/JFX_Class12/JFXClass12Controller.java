import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class JFXClass12Controller {
    @FXML
    private Label label1;

    @FXML
    private RadioButton option1, option2, option3;

    public void select(ActionEvent event){
        if(option1.isSelected()){
            label1.setText("Selected: " + option1.getText());
        }
        else if(option2.isSelected()){
            label1.setText("Selected: " + option2.getText());
        }
        else if(option3.isSelected()){
            label1.setText("Selected: " + option3.getText());
        }
    }
}
