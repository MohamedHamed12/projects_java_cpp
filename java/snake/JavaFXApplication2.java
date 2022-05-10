package javafxapplication2;

import java.awt.Point;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
class mm{
    public void methodOne()
    {
  
        // Some Functionality
    }
}
public class JavaFXApplication2 extends Application{
    double[] a = new double[5];
    String[] stringArray3 = new String[3];
//    stringArray3[0] = "R";
    double[] rand = new double[2];
    boolean play = true;
    public int n = 3;
    double temx = 0;
    double temy = 0;
    double temy2 = 0;
    double temx2 = 0;
    List<Circle> l = new ArrayList<Circle>();
//    element e=new element();
    Circle food = new Circle(-10, -10, 10);

    @Override
    public void start(Stage primaryStage) {
        Text t = new Text(20, 20, "hello");
        Button b = new Button("ok");
        Circle c1 = new Circle(40, 40, 10);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(10);
        rand[0] = (int) (Math.random() * (100 - 1 + 1) + 1) * 10;
        rand[1] = (int) (Math.random() * (100 - 1 + 1) + 1) * 10;
        food.setCenterX(rand[0]);
        food.setCenterY(rand[1]);


        l.add(c2);
        l.add(c3);

        Pane p = new Pane();
        p.getChildren().addAll(c1, c2, c3);

        Scene s = new Scene(p, 900, 900);

        p.getChildren().add(food);


        Timeline tim = new Timeline(
                new KeyFrame(Duration.millis(100),
                        e -> {
                            if(play)
                            
                            {
                            if (check(c1.getCenterX(), c1.getCenterY(), food.getCenterX(), food.getCenterY())) {
                                p.getChildren().add(action());
                            }

                            a[0] = c1.getCenterX();
                            a[1] = c1.getCenterY();
                            if (a[4] == 0) {
                                c1.setCenterX(c1.getCenterX() + 20);
                            } else if (a[4] == 2) {
                                c1.setCenterX(c1.getCenterX() - 20);
                            } else if (a[4] == 1) {
                                c1.setCenterY(c1.getCenterY() - 20);
                            } else if (a[4] == 3) {
                                c1.setCenterY(c1.getCenterY() + 20);
                            }

                            for (Circle cc : l) {

                                a[2] = cc.getCenterX();
                                a[3] = cc.getCenterY();

                                cc.setCenterX(a[0]);
                                cc.setCenterY(a[1]);

                                a[0] = a[2];
                                a[1] = a[3];


                            }
                            
                            
                        }
                        }
                )
        );

        tim.setCycleCount(Timeline.INDEFINITE);
        if (play) {
            tim.play();
        }

        s.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SPACE) {
                if (play) {
                    play = false;
                    tim.pause();
                    
                } else {
                    play = true;
                    tim.play();
                }
            }
            a[0] = c1.getCenterX();
            a[1] = c1.getCenterY();
            if (e.getCode() == KeyCode.RIGHT) {

                a[4] = 0;
            } else if (e.getCode() == KeyCode.LEFT) {

                a[4] = 2;
            } else if (e.getCode() == KeyCode.UP) {

                a[4] = 1;
            } else if (e.getCode() == KeyCode.DOWN) {

                a[4] = 3;

            }  

            for (Circle cc : l) {

                a[2] = cc.getCenterX();
                a[3] = cc.getCenterY();

                cc.setCenterX(a[0]);
                cc.setCenterY(a[1]);

                a[0] = a[2];
                a[1] = a[3];

            }
            

        });

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(s);
        primaryStage.show();
    }
     
    public static void main(String[] args) {
        launch(args);
    }

    public boolean check(double hx, double hy, double fx, double fy) {
        if (Math.abs(hx - fx) < 20 && Math.abs(hy - fy) < 20) {
            return true;
        } else {
            return false;
        }
    }

    public Circle action() {
        rand[0] = (int) (Math.random() * (100 - 1 + 1) + 1) * 10;
        rand[1] = (int) (Math.random() * (100 - 1 + 1) + 1) * 10;

        food.setCenterX(rand[0]);
        food.setCenterY(rand[1]);
        Circle tem = new Circle(10);

        l.add(tem);
        return tem;
    }
}
