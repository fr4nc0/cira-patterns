package it.cira.patterns.creational.builder2;

import java.util.ArrayList;
import java.util.List;

public class Menu {
   private List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

   public float getCost(){
      float cost = 0.0f;
      
      for (Item item : items) {
         cost += item.prezzo();
      }		
      return cost;
   }

   public void showItems(){
   
      for (Item item : items) {
         System.out.print("Item : " + item.nome());
         System.out.print(", Contenitore : " + item.contenitore().prepara());
         System.out.println(", Prezzo : " + item.prezzo());
      }		
   }	
}