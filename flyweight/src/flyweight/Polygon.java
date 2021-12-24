package flyweight;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parsa
 */
public class Polygon implements Shape {
    private String color;
    private int x;
    private int y;
    private int line_thickness;
    
    public Polygon(String color){
        this.color = color;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setLineThickness(int line_thickness) {
        this.line_thickness = line_thickness;
    }

    @Override
    public void draw() {
      System.out.println("Polygon: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", Line Thickness : " + line_thickness );
    }
}