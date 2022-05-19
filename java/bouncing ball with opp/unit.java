/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balls;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class unit extends Circle{
   private int m;
private int prvposx;
private int prvposy;
private int addx;

 

    public void setAddx(int addx) {
        this.addx = addx;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setPrvposx(int prvposx) {
        this.prvposx = prvposx;
    }

    public void setPrvposy(int prvposy) {
        this.prvposy = prvposy;
    }

    public unit(int x, int y, int r,Color c, int m,int addx) {
        this.m = m;
        this.prvposx = x;
        this.prvposy = y;
        this.addx=addx;

        
        setCenterX(x);
//        setPrvposx(x);
        setCenterY(y);
//        setPrvposy(y);
        setRadius(r);
        setFill(c);
    }

    public unit(int m, int prvposx, int prvposy) {
   
    }

    public int getM() {
        return m;
    }

    public int getPrvposx() {
        return prvposx;
    }

    public int getPrvposy() {
        return prvposy;
    }
    
   public int getAddx() {
        return addx;
    }
    
    
}
