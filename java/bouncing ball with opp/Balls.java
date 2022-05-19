
package balls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Balls extends Application {
    int len=800;
    int wid=1200;
    @Override
    public void start(Stage primaryStage) {
//          Button butIV=new Button("Icrease peed");
        element el=new element(10,8);
        Pane root = new Pane(el);
        root.setPrefSize(wid-100, len-100);
        root.setStyle(" -fx-background-color: linear-gradient(from 999px 0px to 1000px 0px, white 0%, white 36.84%, black 36.84%, gray 10%);");
       
        
        Scene scene = new Scene(root,wid,len);
        
        
        
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setResizable(false);
        primaryStage.setTitle("BounsingBall");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
