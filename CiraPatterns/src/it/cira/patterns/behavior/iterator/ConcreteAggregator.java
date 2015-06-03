package it.cira.patterns.behavior.iterator;

import java.util.ArrayList;
 
public class ConcreteAggregator implements Aggregator {
 
    private ArrayList arrayList;
 
    public ConcreteAggregator() {
        arrayList = new ArrayList();
    }
 
    @Override
    public MyIterator createIterator() {
        return new ConcreteIterator( arrayList );
    }
 
    @Override
    public void add(String item) {
        arrayList.add( item );
    }
 
}