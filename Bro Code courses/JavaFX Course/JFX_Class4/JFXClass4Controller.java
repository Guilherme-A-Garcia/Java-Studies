import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class JFXClass4Controller {

    @FXML  // Accessible to the FXML loader.
    private Circle circle1;
    private double x;
    private double y;


    public void up(ActionEvent e){
        // System.out.println("Up!");
        circle1.setCenterY(y-=10);
    }

    public void down(ActionEvent e){
        // System.out.println("Down!");
        circle1.setCenterY(y+=10);
    }

    public void left(ActionEvent e){
        // System.out.println("Left!");
        circle1.setCenterX(x-=10);
    }

    public void right(ActionEvent e){
        // System.out.println("Right!");
        circle1.setCenterX(x+=10);
    }
}