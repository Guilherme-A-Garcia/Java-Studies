import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class JFXClass18Controller implements Initializable{
    @FXML
    private Spinner<Integer> spinner1;
    @FXML
    private Label label1;

    int currentValue;
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
        valueFactory.setValue(1);
        spinner1.setValueFactory(valueFactory);
        currentValue = spinner1.getValue();
        label1.setText(Integer.toString(currentValue));

        spinner1.valueProperty().addListener(new ChangeListener<Integer>() {

            @Override
            public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
                currentValue = spinner1.getValue();
                label1.setText(Integer.toString(currentValue));
            }
        });
    }
}
