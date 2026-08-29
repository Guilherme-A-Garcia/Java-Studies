import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class JFXClass27Controller implements Initializable{

    @FXML
    private Pane pane;

    @FXML
    private Label audioLabel;

    @FXML
    private Button playButton, pauseButton, resetButton, previousButton, nextButton;

    @FXML
    private ComboBox<String> speedBox;

    @FXML
    private Slider volumeSlider;
    
    @FXML
    private ProgressBar audioProgressBar;

    private Media media;
    private MediaPlayer mediaPlayer;

    private File directory;
    private File[] files;
    
    private ArrayList<File> mp3Files;
    
    private int fileNumber;

    private int[] speeds = {25, 50, 75, 100, 125, 150, 175, 200};
    
    private Timer timer;
    
    private TimerTask task;

    private boolean running;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mp3Files = new ArrayList<File>();
        directory = new File("MP3Files").getAbsoluteFile();
        files = directory.listFiles();

        if(files != null){
            for(File file : files){
                mp3Files.add(file);
                // System.out.println(mp3Files);
            }
        }

        media = new Media(mp3Files.get(fileNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        audioLabel.setText(mp3Files.get(fileNumber).getName());

        File selectedFile = mp3Files.get(fileNumber);

        for(int i = 0; i < speeds.length; i++){
            speedBox.getItems().add(Integer.toString(speeds[i])+"%");
        }

        speedBox.setOnAction(this::changeSpeed);

        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                mediaPlayer.setVolume(volumeSlider.getValue() * 0.01);
            }
            
        });

        audioProgressBar.setStyle("-fx-accent: #00FF00");
    }

    public void playMedia(){
        beginTimer();
        changeSpeed(null);
        mediaPlayer.setVolume(volumeSlider.getValue() * 0.01);
        mediaPlayer.play();
    }

    public void pauseMedia(){
        cancelTimer();
        mediaPlayer.pause();
    }

    public void resetMedia(){
        audioProgressBar.setProgress(0);
        mediaPlayer.seek(Duration.seconds(0));
    }

    public void previousMedia(){
        if(fileNumber > 0){
            fileNumber--;

            mediaPlayer.stop();

            if(running){
                cancelTimer();
            }

            media = new Media(mp3Files.get(fileNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            audioLabel.setText(mp3Files.get(fileNumber).getName());
            playMedia();
        }
        else{
            fileNumber = mp3Files.size() - 1;

            mediaPlayer.stop();

            if(running){
                cancelTimer();
            }

            media = new Media(mp3Files.get(fileNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            audioLabel.setText(mp3Files.get(fileNumber).getName());
            playMedia();
        }
    }
    
    public void nextMedia(){
        if(fileNumber < mp3Files.size() - 1){
            fileNumber++;

            mediaPlayer.stop();

            if(running){
                cancelTimer();
            }

            media = new Media(mp3Files.get(fileNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            audioLabel.setText(mp3Files.get(fileNumber).getName());
            playMedia();
        }
        else{
            fileNumber = 0;

            mediaPlayer.stop();

            if(running){
                cancelTimer();
            }

            media = new Media(mp3Files.get(fileNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            audioLabel.setText(mp3Files.get(fileNumber).getName());
            playMedia();
        }
    }

    public void changeSpeed(ActionEvent event){
        if(event == null){
            mediaPlayer.setRate(1);
        }
        else{
            mediaPlayer.setRate(Integer.parseInt(speedBox.getValue().substring(0,speedBox.getValue().length() - 1)) * 0.01);
        }
    }

    public void beginTimer(){
        timer = new Timer();
        task = new TimerTask() {
            public void run(){
                running = true;
                double current = mediaPlayer.getCurrentTime().toSeconds();
                double end = media.getDuration().toSeconds();
                // System.out.println(current/end);
                audioProgressBar.setProgress(current/end);

                if(current/end == 1){
                    cancelTimer();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    public void cancelTimer(){
        running = false;
        timer.cancel();
    }
}
