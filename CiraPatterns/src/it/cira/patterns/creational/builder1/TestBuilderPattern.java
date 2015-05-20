package it.cira.patterns.creational.builder1;


 
public class TestBuilderPattern {
 
    public static void main(String[] args) {
          
    	Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        
        System.out.println(comp.getHDD() + " " + comp.getRAM() + " " + comp.isBluetoothEnabled() + " " + comp.isGraphicsCardEnabled()); 
    }
 
    
}