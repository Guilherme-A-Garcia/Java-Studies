import java.math.BigDecimal;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class JFXClass17Controller implements Initializable {
    
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Button button1;
    @FXML
    private Label label1;

    // The BigDecimal class (sounds silly) class gives its user complete control over rounding behavior.
    BigDecimal progress = new BigDecimal(String.format(Locale.US, "%.2f", 0.0));

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        progressBar.setStyle("-FX-accent: red;");
    }

    public void increaseProgress(){
        if(progress.doubleValue() < 1){
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));  // Has to be double or BigDecimal!
            System.out.println(progress.doubleValue());
            progressBar.setProgress(progress.doubleValue());
            label1.setText("Progress: " + Integer.toString((int)Math.round(progress.doubleValue() * 100)) + "%");
        }
    }
}
