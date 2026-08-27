// Nodes - MediaView

// I'm getting "MediaException: UNKNOWN | Caused by: com.sun.media.jfxmedia.MediaException: Could not create player!",
// and since I've got college assignments to do, I'm not spending time on this.

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JFXClass25 extends Application{
    @Override
    public void start(Stage stage){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("JFXClass25Scene1.fxml"));
            Scene scene = new Scene(root);
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
