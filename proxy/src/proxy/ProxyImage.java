/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author parsa
 */
public class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;
   private int size;

   public ProxyImage(String fileName, int size){
      this.fileName = fileName;
      this.size = size;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}