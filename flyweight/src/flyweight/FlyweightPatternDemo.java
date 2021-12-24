/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author parsa
 */
public class FlyweightPatternDemo {
   private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
   public static void main(String[] args) {

       for (int i = 0; i < 10; ++i) {
           Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
           circle.setX(getRandomX());
           circle.setY(getRandomY());
           circle.setRadius(getRandomRadius());
           circle.draw();
       }
       for (int i = 0; i < 10; ++i) {
           Polygon polygon = (Polygon) ShapeFactory.getPolygon(getRandomColor());
           polygon.setX(getRandomX());
           polygon.setY(getRandomY());
           polygon.setLineThickness(3);
           polygon.draw();
       }
        for (int i = 0; i < 10; ++i) {
           Rectangle rectangle = (Rectangle) ShapeFactory.getRectangle(getRandomColor());
           rectangle.setX(getRandomX());
           rectangle.setY(getRandomY());
           rectangle.setLineThickness(5);
           rectangle.draw();
      }
             
   }
   private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
   private static int getRandomRadius() {
       return (int) (Math.random()*100);
   }
}