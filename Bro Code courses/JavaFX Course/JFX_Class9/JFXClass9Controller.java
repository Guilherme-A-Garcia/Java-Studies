import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JFXClass9Controller {
    @FXML
    ImageView imgView;
    Button button1;

    Image img2 = new Image(getClass().getResourceAsStream("placeholder2.png"));

    public void displayImg(){
        imgView.setImage(img2);
    }
}
