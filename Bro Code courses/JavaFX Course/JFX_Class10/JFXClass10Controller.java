import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JFXClass10Controller {
    
    @FXML
    private Label myLabel;

    @FXML
    private TextField myTextField;

    @FXML
    private Button myButton;

    int age;

    public void submit(ActionEvent event){
        try{
            // myLabel.setText("Welcome!");
            age = Integer.parseInt(myTextField.getText());
            
            if(age >= 18){
                myLabel.setText("You are now signed up!");
            }
            else{
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setContentText("You must be +18!");
                alert.showAndWait();
                myTextField.requestFocus();
                myTextField.selectAll();
            }
        }
        catch(NumberFormatException e){
            // myLabel.setText("Enter only numbers!");
            errorAlert("Enter only numbers!");
            // myTextField.deleteText(0, myTextField.getText().length());
            myTextField.requestFocus();
            myTextField.selectAll();
            
        }
        catch(Exception e){
            errorAlert("Unexpected error: " + e);
            myTextField.requestFocus();
            myTextField.selectAll();
        }
    }

    public void errorAlert(String content){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("An error has occurred");
            alert.setContentText(content);
            alert.showAndWait();
    }
}
