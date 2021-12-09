package Modulo_13.Aula01;

public interface ICarro {

    public void andar();

    default void parar(){
        System.out.println("O veículo está em parando");
    }
}
