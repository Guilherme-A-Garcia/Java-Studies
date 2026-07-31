import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JFXClass7Controller1 {

    @FXML
    TextField nameField;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException{

        String username = nameField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("JFXClass7Scene2.fxml"));
        root = loader.load();

        JFXClass7Controller2 scene2Controller = loader.getController();
        scene2Controller.displayName(username);

        // root = FXMLLoader.load(getClass().getResource("JFXClass7Scene1")); Not needed
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
