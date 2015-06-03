package it.cira.patterns.behavior.visitor;

public class VisitorRettangoloPerimetro implements Visitor {

    @Override
    public void visit(ElementRettangolo elementoRettangolo) {
       int perimentro = (elementoRettangolo.getAltezza() + elementoRettangolo.getLarghezza())*2;
       System.out.println("Il perimetro del rettangolo e': " + perimentro );
    }
 
}