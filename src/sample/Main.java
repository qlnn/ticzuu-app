package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.menu.MainMenu;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Main extends Application {

    private final Logger logger = Logger.getLogger("ticzuuhuj");

    @Override
    public void start(Stage primaryStage) {
        MainMenu mainMenu = new MainMenu();
        primaryStage.setTitle("bydgoszcz - miescowosc ticza");
        primaryStage.setOnCloseRequest(event -> {
            for (int i = 0; i < 10; i++) {
                logger.log(Level.WARNING, "ticzuu huj");
            }
        });
        primaryStage.setScene(mainMenu.getScene());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
