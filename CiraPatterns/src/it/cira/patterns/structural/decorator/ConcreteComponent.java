package it.cira.patterns.structural.decorator;

public class ConcreteComponent implements MyComponent {
	
	@Override
    public void operation(){
        System.out.println("Hello World");
    }
}