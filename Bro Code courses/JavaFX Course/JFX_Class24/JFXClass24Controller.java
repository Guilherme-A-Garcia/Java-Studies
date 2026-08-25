import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class JFXClass24Controller implements Initializable{
    @FXML
    private Rectangle rectangle1;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        
        // Translate
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(rectangle1);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(250);
        translate.setByY(-250);
        translate.setAutoReverse(true);
        translate.play();
        
        //Rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(rectangle1);
        rotate.setDuration(Duration.millis(1000));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(360);
        rotate.play();

        // Fade
        FadeTransition fade = new FadeTransition();
        fade.setNode(rectangle1);
        fade.setDuration(Duration.millis(250));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(1);
        fade.setToValue(0.3);
        fade.setAutoReverse(true);
        fade.play();

        // Scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(rectangle1);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(1.3);
        scale.setByY(1.3);
        scale.setAutoReverse(true);
        scale.play();
    }
}