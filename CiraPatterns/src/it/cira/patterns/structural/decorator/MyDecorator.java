package it.cira.patterns.structural.decorator;

public abstract class MyDecorator implements MyComponent {

    MyComponent myComponent = null;
    
    public MyDecorator(MyComponent myComponent){
        this.myComponent = myComponent;
    }
    @Override
    public void operation() {
    	myComponent.operation();
    }
}