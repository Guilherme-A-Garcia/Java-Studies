import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
// import javafx.scene.layout.Background;
// import javafx.scene.layout.BackgroundFill;
// import javafx.scene.layout.CornerRadii;
// import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class JFXClass14Controller {
    // @FXML
    // Pane myPane;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Circle circle;

    public void changeColor(ActionEvent event){
        Color color = colorPicker.getValue();
        // myPane.setBackground(new Background(new BackgroundFill(color, null, null)));
        circle.setFill(color);
    }
}
