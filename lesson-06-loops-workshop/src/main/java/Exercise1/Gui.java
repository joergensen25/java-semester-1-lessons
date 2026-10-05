package Exercise1;

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

        stage.setTitle("Exercise 1"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(500, 500); // may be changed
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        // TEST 1
//        Line line = new Line(100, 75, 80, 55);
//        pane.getChildren().add(line);
//        Line line2 = new Line(100, 75, 80, 95);
//        pane.getChildren().add(line2);
//
//        Line line3 = new Line(100, 125, 80, 105);
//        pane.getChildren().add(line3);
//        Line line4 = new Line(100, 125, 80, 145);
//        pane.getChildren().add(line4);
//
//        Line line5 = new Line(20, 50, 0, 30);
//        pane.getChildren().add(line5);
//        Line line6 = new Line(20, 50, 0, 70);
//        pane.getChildren().add(line6);


        int length = 0;
        int height = 0;

        int x = 50;
        int y = 30;
        Line line1 = new Line(x, y, x + length, y - height);
        Line line2 = new Line(x, y, x + length, y + height);
        pane.getChildren().addAll(line1, line2);
// draw an arrowhead at (25,140)
        x = 25;
        y = 140;
        Line line3 = new Line(x, y, x + length, y - height);
        Line line4 = new Line(x, y, x + length, y + height);
        pane.getChildren().addAll(line3, line4);

        // TEST 2

    }
}