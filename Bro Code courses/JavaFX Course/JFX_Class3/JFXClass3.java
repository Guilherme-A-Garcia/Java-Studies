// Useful Tools - Scene Builder

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFXClass3 extends Application {
    public static void main(String[] args){
        launch();
    }

    // Scene Builder is a handy drag-and-drop tool designed to help you add nodes to scenes.
    // With Scene Builder installed, create a .fxml file and open it with the application.

    // Check "JFXClass3.fxml" for context!

    // It's recommendable to add the "AnchorPane" container to the Hierarchy tab.

    @Override
    public void start(Stage stage) throws IOException{
        // Group root = new Group();
        // Instead of a Group object being our root, we need to create a Parent object.
        Parent root = FXMLLoader.load(getClass().getResource("JFXClass3.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }    
}
