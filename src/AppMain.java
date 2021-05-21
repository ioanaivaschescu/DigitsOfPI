import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppMain extends Application {

    private Stage primaryStage;


    public void start(Stage primaryStage) throws IOException {

        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("Fratii Prastie CPU Benchmark");
        this.primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(AppMain.class.getResource("resource/MainView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        Image icon = new Image("prastie.png");
        primaryStage.getIcons().add(icon);
    }

    public static void main(String[] args){
        launch(args);
    }

}
