package Modulo_17.trefa_mod_17.Jeep;

import Modulo_17.trefa_mod_17.Carro;
import Modulo_17.trefa_mod_17.Chevrolet.Camaro;
import Modulo_17.trefa_mod_17.Chevrolet.Spin;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric{

    public static void imprimir(List<?> lista){
        for(Object st : lista ){
            System.out.println(st.getClass().getSimpleName() + " " + st);
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>();
        listaString.add("STR1");
        listaString.add("STR2");
        imprimir(listaString);

        List<Integer> listaIntero = new ArrayList<>();
        listaIntero.add(1);
        listaIntero.add(2);
        imprimir(listaIntero);

        List<Carro> listaCarro = new ArrayList<>();
        listaCarro.add(new Commander());
        listaCarro.add(new Spin());
        imprimir(listaCarro);
    }
}
