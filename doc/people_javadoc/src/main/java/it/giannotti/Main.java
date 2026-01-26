package it.giannotti;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("mario", "rossi", "MRRRSS05G99M883C");
        Persona p2 = new Persona("mario", "verdi", "MRRVRD12A94R293G");
        System.out.println(p.toString());
        System.out.println(p.isOmonimo(p2));
        Persona p3 = new Persona("ciao", "asd", "jfjekjkjeijijgrij");
    }
}