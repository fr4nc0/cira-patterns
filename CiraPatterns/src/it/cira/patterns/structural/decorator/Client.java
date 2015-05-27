package it.cira.patterns.structural.decorator;

class Client {
    public static void main(String[] args) {
        MyComponent myComponent = new SynchronizingDecorator(
        		new SpecializedLoggingDecorator(
        						new ConcreteComponent()));
        myComponent.operation();
    }
}