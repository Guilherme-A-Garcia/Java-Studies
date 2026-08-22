// Application Flow - Detecting key events

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class JFXClass23 extends Application{
    @Override
    public void start(Stage stage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("JFXClass23Scene1.fxml"));
            Parent root = loader.load();
            JFXClass23Controller controller = loader.getController();
            Scene scene = new Scene(root);

            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

                @Override
                public void handle(KeyEvent event) {
                    // System.out.println(event.getCode());
                    switch(event.getCode()){
                        case W, UP:
                            controller.moveUp();
                            break;
                        case S, DOWN:
                            controller.moveDown();
                            break;
                        case A, LEFT:
                            controller.moveLeft();
                            break;
                        case D, RIGHT:
                            controller.moveRight();
                            break;
                        default:
                            break;
                    }
                }
                
            });
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