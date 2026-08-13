import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class JFXClass16Controller implements Initializable{
    @FXML
    private Slider slider1;
    @FXML
    private Label label1;

    int temperature;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        slider1.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                temperature = (int)slider1.getValue();
                label1.setText("Number: " + Integer.toString(temperature));
            }

        });
    }
}
