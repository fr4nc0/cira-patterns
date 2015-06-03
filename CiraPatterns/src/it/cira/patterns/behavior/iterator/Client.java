package it.cira.patterns.behavior.iterator;

public class Client {
 
    public static void main(String[] args) {
        Aggregator aggregate = new ConcreteAggregator();
        aggregate.add("item1");
        aggregate.add("item2");
 
        MyIterator iterator = aggregate.createIterator();
        while ( iterator.hasNext() ) {
            System.out.println( iterator.next() );
        }
    }
 
}