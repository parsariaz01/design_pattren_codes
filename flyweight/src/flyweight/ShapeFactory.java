/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.HashMap;

/**
 *
 * @author parsa
 */
public class ShapeFactory {
      // Uncomment the compiler directive line and
   // javac *.java will compile properly.
   // @SuppressWarnings("unchecked")
   private static final HashMap circleMap = new HashMap();
   private static final HashMap polygonMap = new HashMap();
   private static final HashMap rectangleMap = new HashMap();

   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);

      if(circle == null) {
         circle = new Circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
   
   public static Shape getPolygon(String color) {
      Polygon polygon = (Polygon)polygonMap.get(color);

      if(polygon == null) {
         polygon = new Polygon(color);
         polygonMap.put(color, polygon);
         System.out.println("Creating Polygon of color : " + color);
      }
      return polygon;
   }
   
    public static Shape getRectangle(String color) {
      Rectangle rectangle = (Rectangle)rectangleMap.get(color);

      if(rectangle == null) {
         rectangle = new Rectangle(color);
         rectangleMap.put(color, rectangle);
         System.out.println("Creating Rectangle of color : " + color);
      }
      return rectangle;
   }
}