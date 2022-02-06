package Modulo_17;

import java.util.ArrayList;
import java.util.List;

public class Aula01 {

    public static void main(String[] args) {

        List<String> listaString = new ArrayList<>();
        listaString.add("Rodrigo");
        listaString.add("1");
        imprimirListaString(listaString);
        imprimirLista(listaString);
        pegarPrimerioLista(listaString);
        imprimir2(listaString);

        System.out.println("---------------------------------------");

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(1l);
        listaLong.add(2l);
        imprimirListaLong(listaLong);
        imprimirLista(listaLong);
        pegarPrimerioLista(listaLong);
        imprimir2(listaLong);
    }

    public static void imprimirListaString(List<String> list){
        System.out.println("Imprimindo lista de String");
        for (String st : list){
            System.out.println(st);
        }
    }

    public static void imprimirListaLong(List<Long> list){
        System.out.println("Imprimino Lista de Long");
        for (Long lg : list){
            System.out.println(lg);
        }
    }

    public static <T> void imprimirLista(List<T> list){
        System.out.println("Imprimindo Lista");
        for (T t : list){
            System.out.println(t);
        }
    }

    public static <T> T pegarPrimerioLista(List<T> lista){
        System.out.print("Retornando o primeiro da lista: ");
        System.out.println(lista.get(0));
        return lista.get(0);
    }

    // aceita qualquer coisa que for passado
    // Diferente do <T> que é um tipo genérico
    public static void imprimir2(List<?> lista){
        for(Object st : lista ){
            System.out.println("Qualquer coisa: " + st);
        }
    }
}
