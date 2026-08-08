import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class JFXClass13Controller {
    @FXML
    private DatePicker date;

    @FXML
    private Label label1;

    public void getDate(ActionEvent event){
        LocalDate myDate = date.getValue();
        // System.out.println(myDate.toString());
        String formattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        label1.setText(formattedDate);
    }
}
