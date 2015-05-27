package it.cira.patterns.structural.decorator;

public class SynchronizingDecorator extends MyDecorator { 
 
    public SynchronizingDecorator(MyComponent myComponent){
        super(myComponent);
    }
    @Override
    public void operation() {
        System.out.println("Start Synchronizing");
        synchronized (this){
        	super.operation();
        }
        System.out.println("End Synchronizing");
    }
}