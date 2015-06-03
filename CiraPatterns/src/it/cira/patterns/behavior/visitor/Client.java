package it.cira.patterns.behavior.visitor;
public class Client {
 
    public static void main(String[] args) {
        ElementRettangolo elementRettangolo = new ElementRettangolo();
        elementRettangolo.setAltezza(10);
        elementRettangolo.setLarghezza(20);
        elementRettangolo.accept( new VisitorRettangoloPerimetro() );
        elementRettangolo.accept( new VisitorRettangoloAria() );
    }
 
}