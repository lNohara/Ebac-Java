package Modulo_13.Aula01;

public class CanetaEsferografica implements ICaneta
{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor: " + texto + " Na Classe: " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Preta";
    }
}
