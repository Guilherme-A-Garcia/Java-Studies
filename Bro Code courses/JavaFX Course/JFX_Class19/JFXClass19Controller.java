import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class JFXClass19Controller implements Initializable {
    @FXML
    private ListView<String> listView;
    @FXML
    private Label label1;

    String[] options = {"Option 1", "Option 2", "Option 3"};
    String currentOption;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        listView.getItems().addAll(options);

        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                currentOption = listView.getSelectionModel().getSelectedItem();
                label1.setText(currentOption);
            }
            
        });
    }
}
