// GUI Flow Management - Logout/exit button

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class JFXClass8 extends Application {
    @Override
    public void start(Stage stage){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("JFXClass8Scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(event -> {
                // You need to consume an event to limit the function's propagation
                event.consume();
                logout(stage);
            });
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void logout(Stage stage){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout Confirmation");
        alert.setHeaderText("You're about to log out.");
        alert.setContentText("Are you sure you want to proceed?");

        if(alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out!");
            stage.close();
        }
}

    public static void main(String[] args){
        launch(args);
    }
}
