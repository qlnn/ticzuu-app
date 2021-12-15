package sample.menu;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.concurrent.ThreadLocalRandom;

public final class MainMenu extends AnchorPane {

    private final String[] funfacts = {"Jestem bambikiem", "Jestem nigerem", "Mieszkam w bydgoszczu", "jestem gejem"};

    public MainMenu() {
        new Scene(this);
        setPrefSize(900, 600);
        setStyle("-fx-background-color: #224149;");
        ImageView ticzuu = new ImageView("resources/ticzuu.png");
        ticzuu.setOnMouseEntered(event -> {
            ticzuu.setEffect(new DropShadow(100, Color.BROWN));
        });
        ticzuu.setOnMouseExited(event -> {
            ticzuu.setEffect(null);
        });
        ticzuu.setFitHeight(350);
        ticzuu.setFitWidth(350);
        Text text = new Text();
        text.setFill(Color.RED);
        text.setText("Kliknij jego zdjecie, aby otrzymac fun fact");
        text.setFont(Font.font("Roboto", 20));
        text.setTranslateX(400);
        text.setTranslateY(100);
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Text funfact = new Text();
        funfact.setFill(Color.GREEN);
        funfact.setText("brak fun factu :(");
        funfact.setFont(Font.font("Roboto", 20));
        funfact.setTranslateX(400);
        funfact.setTranslateY(200);
        ticzuu.setOnMousePressed(event -> {
            funfact.setText("Fun fact: "+funfacts[random.nextInt(funfacts.length)]);
        });
        Text iq = new Text();
        iq.setFill(Color.GREEN);
        iq.setText("IQ: 0");
        iq.setFont(Font.font("Roboto", 20));
        iq.setTranslateX(400);
        iq.setTranslateY(500);
        Button button = new Button("Jego iq!");
        button.setPrefSize(300, 100);
        button.setTranslateY(500);
        button.setStyle("-fx-background-color: #14272b;");
        button.setOnMouseEntered(event -> button.setEffect(new Glow()));
        button.setOnMouseExited(event -> button.setEffect(null));
        button.setOnMousePressed(event -> {
            iq.setText("IQ: " + random.nextInt(-200, -20));
        });
        getChildren().add(ticzuu);
        getChildren().add(text);
        getChildren().add(funfact);
        getChildren().add(button);
        getChildren().add(iq);
    }
}
