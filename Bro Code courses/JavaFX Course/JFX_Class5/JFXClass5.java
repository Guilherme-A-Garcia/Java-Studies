// GUI Development - CSS styling

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFXClass5 extends Application {
    @Override
    public void start(Stage stage){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("JFXClass5.fxml"));
            Scene scene = new Scene(root);

            // Extremely important: applying the .css to the scene.
            scene.getStylesheets().add(getClass().getResource("JFXClass5.css").toExternalForm());
            // If you're applying a stylesheet to more than one scene, it's recommendable to
            // break down this line of code into two, like this:
            // String css = this.getClass().getResource("JFXClass5.css").toExternalForm();
            // scene.getStylesheets().add(css);

            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        launch(args);
    }
}
