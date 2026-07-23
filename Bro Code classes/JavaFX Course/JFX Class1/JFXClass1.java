// JavaFX - Learning the fundamentals

/* 
FILE EXECUTION NOTE (No Maven/Gradle):
The JavaFX files contained by "JavaFX Course" are ran with Code Runner.
The settings.json command enters the directory ($dir), links the JavaFX SDK 
through --module-path/--add-modules, runs and cleans up .class files on exit.
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

// This one class, "Main.java", inherits everything from it's abstract parent "Application.java".
public class JFXClass1 extends Application{
    public static void main(String[] args){
        /*
        The GUI is composed of three layers:
        1. Stage: Top-level container. Just think of it as the window itself.
        
        2. Scene: We add a Scene to the Stage. A Scene is a drawing surface
        for graphical content, similar to a Frame in Tkinter.
        
        3. Scene-Graph: A hierarchical tree of nodes, a tree data-structure to
        hold and arrange what are called "nodes".
        
        3.5: Scene-Graph Nodes: All the different components that we add to a
        Scene. They're arranged in a hierarchical tree, beginning with
        root-node, descending into leaf-nodes and branch-nodes.
        */

    //  Application.launch(args); | launch() is a static method, so you can call it from Application.
        launch(args);
    }

    // Since we are inheriting from an abstract class, we need to
    // override unimplemented methods:
    @Override
    public void start(Stage stage) throws Exception {
        // Stage stage = new Stage(); <- Since we're already receiving a Stage object
        //                               as argument, we don't need a new one.
        
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK); // Scene requires a root node as argument.
        
        // You can set Stage attributes:
        Image icon = new Image("resources/icon.png");

        stage.setTitle("First Class \\o/");
        stage.getIcons().add(icon);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        // stage.setX(50);
        // stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setFullScreenExitHint("You cannot exit full-screen unless you press 'Q'");
        
        // We first add the node group (the "actors") to the Scene;
        
        stage.setScene(scene); // Then we add the Scene to the Stage;
        
        stage.show(); // And finally, we show the Stage. Think of it as a play.
    }
}