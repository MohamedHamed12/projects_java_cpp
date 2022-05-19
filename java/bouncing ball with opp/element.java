
package balls;

import java.util.ArrayList;
import java.util.List;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class element extends Pane{
        private String[]color={"RED","BLUE","GREEN","BROWN","CHARTREUSE","CHOCOLATE","DARKMAGENTA","DARKSEAGREEN","GOLD","GRAY"};
        private int len=800;
        private int wid=1000;
        private boolean play=false;
        
        
    BorderPane p;
    
    Timeline time;

    
    unitbut butplay;
    unitbut butIncV;
     unitbut butDecV;
     
    List<unit> l;
    public element(int n,int t)
         {
             butplay=new unitbut("pause");
       
             butIncV=new unitbut("Icrease Speed");
              butDecV=new unitbut("Decrease Speed");
             
             
          l=new ArrayList<unit>();
             for(int i=0;i<n;i++)
             {
                                              
               
                unit tem=new unit(valx(),valy(),valr(),valc(i),valm(),valxadd());
                getChildren().add(tem);
//                getChildren().add(tem);
                l.add(tem);
         }
//              getChildren().add(p);
            setbutton();
              control control1=new control(l,t,len,wid);
              
             
              
                    butplay.setOnAction((e) -> {
                 control1.PlayStop();
             });
                    
                    butIncV.setOnAction(e->{
             control1.incspeed();
         });
                    
                    
         butDecV.setOnAction(e->{
             control1.decspeed();
         });
//                    
    }
    public void setbutton(){
         VBox v=new VBox();
//          v.getChildren().addAll(butplay,butIncV);
          v.getChildren().addAll(butplay,butIncV,butDecV);
          v.setSpacing(20);
         v.setLayoutX(1050);
                  v.setLayoutY(60);
                 

             
             getChildren().add(v);
    }

    public int getLen() {
        return len;
    }

    public int getWid() {
        return wid;
    }
         
    
    
      public int  getrand(int m,int n )
    {
        return m+ (int)(Math.random()*n);
    }
      public int valx()
      {
          return getrand(80,wid-100);
      }
      public int valy()
      {
          return getrand(80,len-100);
      }
      public int valr()
      {
          return getrand(10,30);
      }
      public Color valc(int i)
      {
          return Color.web(color[i]);
      }
      public int  valm()
      {
          return 5;
      }
      public int valxadd()
      {
          return (int)(Math.pow(-1, getrand(1,10)));
      }
      
  
}
