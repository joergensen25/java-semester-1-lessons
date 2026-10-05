package Exercise4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


import java.awt.*;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Exercise 4"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(1000, 1000); // may be changed
        this.drawShapesC(pane);
        return pane;
    }

    // ------------------------------------------------------------------------
    private void drawShapes(Pane pane) {
        int x = 200; // center: (x,y)
        int y = 200;
        int r = 40; // radius: r
        while (r <= 160) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            r += 30;
        }
    }

    private void drawShapesB(Pane pane) {
        int x = 40;
        int y = 300;
        int r = 20;
        while (r <= 230) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            r += 30;
            x += 30;
        }
    }

    private void drawShapesC(Pane pane) {
        int x = 200;
        int y = 100;
        int r1 = 30;
        int r2 = 60;
        while (r1 <= 145) {
            Ellipse ellipse = new Ellipse(x, y, r1, r2);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(null);
            pane.getChildren().add(ellipse);
            r1 += 15;
        }
    }
}
