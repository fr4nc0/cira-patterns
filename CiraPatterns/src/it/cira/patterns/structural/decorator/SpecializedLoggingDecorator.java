package it.cira.patterns.structural.decorator;

public class SpecializedLoggingDecorator extends LoggingDecorator { 
 
    public SpecializedLoggingDecorator(MyComponent myComponent){
        super(myComponent);
    }
    @Override
    public void operation() {
        System.out.println("Start Specialized Logging");
        super.operation();
        System.out.println("End Specialized Logging");
    }
}