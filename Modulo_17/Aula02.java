package Modulo_17;

import java.util.List;

public class Aula02<T, E>{

    private T data;
    private E codigo;

    public T getData(){
        return this.data;
    }

    public Aula02(T data, E codigo){
        this.data = data;
        this.codigo = codigo;
    }

    public static void main(String[] args) {
        Aula02<Long, Integer> entry = new Aula02<>(10L, 20);
        System.out.println(entry.getData());

        Aula02<String, Integer> entry2 = new Aula02<>("String", 20);
        System.out.println(entry2.getData());
    }


}
