package it.cira.patterns.behavior.iterator;

public interface Aggregator {
 
    public MyIterator createIterator();
    public void add(String item);
 
}