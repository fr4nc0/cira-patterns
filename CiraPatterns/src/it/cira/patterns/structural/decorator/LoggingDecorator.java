package it.cira.patterns.structural.decorator;

public class LoggingDecorator extends MyDecorator { 
 
    public LoggingDecorator(MyComponent myComponent){
        super(myComponent);
    }
    @Override
    public void operation() {
        System.out.println("Start Logging");
        super.operation();
        System.out.println("End Logging");
    }
}