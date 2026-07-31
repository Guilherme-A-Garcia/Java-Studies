import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class JFXClass7Controller2 {
    @FXML
    Label nameLabel;

    public void displayName(String username){
        nameLabel.setText("Username: " + username); 
    }
}
