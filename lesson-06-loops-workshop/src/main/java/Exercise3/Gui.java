package Exercise3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Exercise 3"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(500, 500); // may be changed
        this.drawShapesC(pane);
        return pane;
    }

    // ------------------------------------------------------------------------
    // FIGUR 1
    private void drawShapes(Pane pane) {
        int x = 20; // start point: (x1,y1)
        int y1 = 20;
        int y2 = 200;
        while (x <= 180) {
            Line line = new Line(x, y1, x, y2);
            pane.getChildren().add(line);
            x += 40;
        }
    }
    // FIGUR 2
    private void drawShapesB(Pane pane) {
        int x3 = 220; // start point: (x1,y1)
        int x4 = 400; // end point: (x2,y2)
        int y = 20;
        while (y <= 180) {
            Line line = new Line(x3, y, x4, y);
            pane.getChildren().add(line);
            y += 40;
        }
    }
    // FIGUR 3
    private void drawShapesC(Pane pane) {
        int x5 = 20; // start point: (x1,y1)
        int x6 = 200; // end point: (x2,y2)
        int y6 = 180;
        while (y6 >= 20) {
            Line line = new Line(x5, y6, x6, y6);
            pane.getChildren().add(line);
            y6 -= 40;
            x5 += 20;
            x6 -= 20;
        }
    }
}