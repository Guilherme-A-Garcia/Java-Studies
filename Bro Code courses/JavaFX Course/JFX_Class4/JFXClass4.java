// Useful Tools - Event handling with Scene Builder

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFXClass4 extends Application{
    public static void main(String[] args){
        // It's good practice to separate event-related methods in a new Controller.java file.
        // For that matter, check file "JFXClass4Controller.java"!
        
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("JFXClass4.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
