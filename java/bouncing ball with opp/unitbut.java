
package balls;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;


public class unitbut extends Button{
    private String s;
    
    public  unitbut(String s){
        this.s=s;
       
        setText(s);
//         setStyle("-fx-background-color: #ff0000; ");
    setStyle(" -fx-background-color:#FF8A33;");
           setMinSize(120, 40);
    }
}
