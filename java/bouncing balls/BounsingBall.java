
package bounsing.ball;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class BounsingBall extends Application {
    int[] t=new int[1];
    boolean k=true;
    boolean []play=new boolean[1];
      double []temx=new double[10];
      public double []temy=new double[10];
      public double []temm=new double[10];
      public  int[] vx=new int[10];
       Timeline tim;
    public String[]co={"RED","BLUE","GREEN","BROWN","CHARTREUSE","CHOCOLATE","DARKMAGENTA","DARKSEAGREEN","GOLD","GRAY"};
    int len=800;
    int wid=1000;
    Scene scene;
    
    List<Circle> l;
    Pane root ;
    Button but=new Button("pause");
    Button butIncV=new Button("Icrease Speed");

    
    
    @Override
    public void start(Stage primaryStage) {
        play[0]=true;
        t[0]=4;
        but.setLayoutX(1050);
        but.setLayoutY(20);
        but.setMinSize(100, 40);
        l = new ArrayList<Circle>();
        root = new Pane();
        root.setPrefSize(wid-100, len-100);
        root.setStyle(" -fx-background-color: linear-gradient(from 999px 0px to 1000px 0px, white 0%, white 36.84%, black 36.84%, gray 100%);");
        createBalls(l, 10, root);
        createTim(l, t[0],scene,play);
        checkbutPlayPuase(play);
//        checkButIncV();
        root.getChildren().addAll(but,butIncV);

        

   
         primaryStage.setResizable(false);
         scene = new Scene(root, wid  +200 , len);
        primaryStage.setTitle("BounsingBall");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

     public static void main(String[] args) {
        launch(args);
    }


    public void moving(int x1,int y1,int x2,int y2 )
    {
        
    }
    public double gety(Circle c,int i)
    {
       return temm[i]*(c.getCenterX()-temx[i])+temy[i];
    }
    public double getx(Circle c,double i)
    {
       return c.getCenterX()+i;
    }
    public int  getrand(int n,int m)
    {
        return m+ (int)(Math.random()*n);
    }
    public void createBalls( List<Circle> l ,int t,Pane root)
    {
         for(int i=0;i<t;i++)
         {
             temx[i]=getrand(wid-80,80);
                          temy[i]=getrand(len-80,80);

               temm[i]=3;
               vx[i]=(int)Math.pow(-1, getrand(10,1));
               Circle tem=new Circle(temx[i],temy[i],getrand(30,10),Color.web(co[i]));

             l.add(tem);
             root.getChildren().add(tem);

         }

    }
    public void  moveBalls(List<Circle>l)
    { 
        
        int i=0;
         for(Circle cc:l)
                  {
                         if ( cc.getCenterY()+cc.getRadius()>len && temy[i]<len)
                      {
                            temx[i]=cc.getCenterX();
                             temy[i]=cc.getCenterY();
                              temm[i]=-temm[i];
                              
                            
                 }
                           if (cc.getCenterY()-cc.getRadius()<0 && temy[i]>0)
                  {
                             temx[i]=cc.getCenterX();
                             temy[i]=cc.getCenterY();
                              temm[i]=-temm[i];
                             
                              
                 }
                           
                            if (cc.getCenterX()+cc.getRadius()>wid )
                  {
                      temx[i]=cc.getCenterX();
                              temy[i]=cc.getCenterY();
                              temm[i]=-temm[i];
                                vx[i]=-1;
                             
                              
                  }
                     if (cc.getCenterX()-cc.getRadius()<0  )
                  {
                      temx[i]=cc.getCenterX();
                              temy[i]=cc.getCenterY();
                              temm[i]=-temm[i];
                              vx[i]=1;
                             
                              
                  }  
                        cc.setCenterX(getx(cc, vx[i]));
                 cc.setCenterY(gety(cc,i));  
                         
                          i+=1; 

                  }
    }
    public void createTim(List<Circle>l,int t,Scene s,boolean []play)
    {
        
         
         tim=new Timeline(
        new KeyFrame(Duration.millis(t),
              e->{ 
//                  getPuase(s,play);

     moveBalls(l);

                 
              }

        ) );
        
        tim.setCycleCount(Timeline.INDEFINITE);
        if (play[0]) {
            tim.play();
        }

    }
    public void checkbutPlayPuase(boolean []play)
    {
        but.setOnAction((event) -> {
            if (play[0])
            {
                 play[0]=false;
             tim.pause();
             but.setText("play");
            }
            else
            {
                play[0]=true;
             tim.play();
             but.setText("pause");
            }
        });
    }
//     public void checkButIncV()
//     {
//       
//         butIncV.setOnAction((event) -> {
////                tim.stop();
////      tim.getKeyFrames().clear();
//      tim = null;
//              t[0]+=2;
//             createTim(l,t[0], scene, play);
//                    
//                    System.out.println(t[0]);
//
//        });
//         
//     }
//    public void getPuase(Scene s,boolean []play)
//    { 
//         
//        
//        
//    }
}
