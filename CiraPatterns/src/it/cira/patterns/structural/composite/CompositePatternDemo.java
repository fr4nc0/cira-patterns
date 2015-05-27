package it.cira.patterns.structural.composite;


	public class CompositePatternDemo {
		
		   public static void main(String[] args) {
		   
		      Impiegato CEO 			= new Impiegato("John","CEO", 30000);
		      Impiegato headSales 		= new Impiegato("Robert","Head Sales", 20000);
		      Impiegato headMarketing 	= new Impiegato("Michel","Head Marketing", 20000);
		      Impiegato clerk1 			= new Impiegato("Laura","Marketing", 10000);
		      Impiegato clerk2 			= new Impiegato("Bob","Marketing", 10000);
		      Impiegato salesExecutive1 = new Impiegato("Richard","Sales", 10000);
		      Impiegato salesExecutive2 = new Impiegato("Rob","Sales", 10000);

		      CEO.add(headSales);
		      CEO.add(headMarketing);

		      headSales.add(salesExecutive1);
		      headSales.add(salesExecutive2);

		      headMarketing.add(clerk1);
		      headMarketing.add(clerk2);

		      //print all employees of the organization
		      System.out.println(CEO); 
		      
		      for (Impiegato headEmployee : CEO.getSottoposti()) {
		         System.out.println(headEmployee);
		         
		         for (Impiegato employee : headEmployee.getSottoposti()) {
		            System.out.println(employee);
		         }
		      }		
		   }
		
}
