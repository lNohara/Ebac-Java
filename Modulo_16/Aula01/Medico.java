package Modulo_16.Aula01;

public class Medico extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Médico");
    }

    @Override
    public void executarRotina() {
        System.out.println("Estou de Férias");
    }
}
