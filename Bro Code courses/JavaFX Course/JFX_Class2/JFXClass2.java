// Basic Architecture - Scene

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;

public class JFXClass2 extends Application {
    public static void main(String[] args){
        launch(args);        
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTGRAY);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Test text");
        text.setY(50);
        text.setX(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.rgb(12, 23, 51));

        Line line = new Line();
        line.setStartX(60);
        line.setStartY(60);
        line.setEndX(248);
        line.setEndY(60);
        line.setStrokeWidth(2);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        // line.setRotate(20);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.GRAY);
        rectangle.setStrokeWidth(2);
        rectangle.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(280.0, 280.0,
                                    380.0, 380.0,
                                    280.0, 380.0);
        triangle.setFill(Color.GRAY);

        Circle circle = new Circle();
        circle.setCenterX(380);
        circle.setCenterY(250);
        circle.setRadius(50);
        circle.setFill(Color.GRAY);

        Image image = new Image("resources/placeholder.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(20);
        imageView.setY(350);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }
}
