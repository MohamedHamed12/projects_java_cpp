
package balls;

import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


public class control {
    Timeline tim;
    private int len;
    private int wid ;
    
    
    
    
     
    
    public control(List<unit>l,int t,int len,int wid)
    {
        
   this.len=len;
   this.wid=wid;
        tim=new Timeline(
        new KeyFrame(Duration.millis(t),
              e->{ 

     moveBalls(l);

                 
              }

        ) );
          tim.setCycleCount(Timeline.INDEFINITE);
        
//            tim.play();
        
    }
   
    
    public void setLen(int len) {
        this.len = len;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }
    
    public void  moveBalls(List<unit>l)
    { 
        
        int i=0;
         for(unit cc:l)
                  {
                         if ( cc.getCenterY()+cc.getRadius()>len && cc.getPrvposy()<len)
                      {
                    
                                cc.setPrvposx((int)cc.getCenterX());
                             cc.setPrvposy((int)cc.getCenterY());
                             cc.setM(-cc.getM());
                            
                 }
                           if (cc.getCenterY()-cc.getRadius()<0 && cc.getPrvposy()>0)
                  {
                             cc.setPrvposx((int)cc.getCenterX());
                             cc.setPrvposy((int)cc.getCenterY());
                             cc.setM(-cc.getM());
                             
                              
                 }
                           
                            if (cc.getCenterX()+cc.getRadius()>wid )
                  {
                    cc.setPrvposx((int)cc.getCenterX());
                             cc.setPrvposy((int)cc.getCenterY());
                             cc.setM(-cc.getM());
                             cc.setAddx(-1); 
                             
                              
                  }
                     if (cc.getCenterX()-cc.getRadius()<0  )
                  {
                          cc.setPrvposx((int)cc.getCenterX());
                             cc.setPrvposy((int)cc.getCenterY());
                             cc.setM(-cc.getM());
                                cc.setAddx(1); 
                             
                              
                  }  
                        cc.setCenterX(getx(cc));
                 cc.setCenterY(gety(cc));  
                         
                          i+=1; 

                  }
    }
        public double gety(unit c)
    {
       return c.getM()*(c.getCenterX()-c.getPrvposx())+c.getPrvposy();
    }
    public double getx(unit c)
    {
       return c.getCenterX()+c.getAddx();
    }
    
    public void  PlayStop()
    {
        if  (tim.getStatus()==Timeline.Status.RUNNING)
        tim.pause();
        else
            tim.play();
    }
    public void incspeed(){
        tim.setRate(tim.getRate()*(1.5));
    }
    public void decspeed(){
        tim.setRate(tim.getRate()/1.5);
    }
}
