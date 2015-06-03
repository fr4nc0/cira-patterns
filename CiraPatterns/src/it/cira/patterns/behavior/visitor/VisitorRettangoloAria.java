package it.cira.patterns.behavior.visitor;

public class VisitorRettangoloAria implements Visitor {
 
    @Override
    public void visit(ElementRettangolo elementRettangolo) {
        int aria = elementRettangolo.getAltezza() * elementRettangolo.getLarghezza();
        System.out.println("L'area del rettangolo e': "+ aria);
    }
}