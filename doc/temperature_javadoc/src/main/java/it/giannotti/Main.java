package it.giannotti;

public class Main {
    public static void main(String[] args) {
        Temperatura temp = new Temperatura(25.0);
        System.out.println("Temperatura iniziale: " + temp.toString());
        temp.aumenta(5.0);
        System.out.println("Dopo aumento di 5 gradi: " + temp.toString());
        temp.diminuisci(10.0);
        System.out.println("Dopo diminuzione di 10 gradi: " + temp.toString());

    }
}