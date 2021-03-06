import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        MyScene scene = new MyScene();
        stage.getIcons().add(new Image("icon.png"));
        stage.setScene(scene);
        scene.getStylesheets().add("styling.css");
        stage.setResizable(true);
        stage.setTitle("Hangman");
        stage.show();
    }
}