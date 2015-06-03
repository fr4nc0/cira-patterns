package it.cira.patterns.behavior.visitor;

public class ElementRettangolo {
 
    private int altezza;
    private int larghezza;
 
    public int getAltezza() {
        return this.altezza;
    }
 
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
 
    public int getLarghezza() {
        return this.larghezza;
    }
 
    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }
 
    public void accept(Visitor visitor) {
    	visitor.visit(this);
    }
}