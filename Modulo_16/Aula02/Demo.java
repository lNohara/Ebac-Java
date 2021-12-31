package Modulo_16.Aula02;

public class Demo {
    public static void main(String[] args) {
        Jornalist jornalist = new Jornalist();
        jornalist.registerObserver(new Newspaper());
        jornalist.registerObserver(new TV());

        jornalist.publish("Titulo", "Summary", "Imagem", "Texto");
    }
}
