package Modulo_17.trefa_mod_17;

import Modulo_17.trefa_mod_17.Audi.RoadsterTTS;
import Modulo_17.trefa_mod_17.Audi.SedanA4;
import Modulo_17.trefa_mod_17.Audi.SportbackA3;
import Modulo_17.trefa_mod_17.Chevrolet.Camaro;
import Modulo_17.trefa_mod_17.Chevrolet.Spin;
import Modulo_17.trefa_mod_17.Jeep.Commander;
import Modulo_17.trefa_mod_17.Jeep.Renegade;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new SportbackA3());
        carros.add(new SedanA4());
        carros.add(new RoadsterTTS());

        //Chevrolet
        carros.add(new Camaro());
        carros.add(new Spin());

        //Jeep
        carros.add(new Commander());
        carros.add(new Renegade());

        listarCarros(carros);
        listaExtrendsCarro(carros);
        imprimirGeneric(carros);
    }

    public static void listarCarros(List<Carro> carros ){
        System.out.println("Imprimindo uma lista de carros");
        for(Carro carro : carros){
            System.out.println(carro.getMarca() + "-" + carro.getModelo());
        }
        System.out.println("");
    }

    public static void listaExtrendsCarro(List<? extends Carro> carros){
        System.out.println("Imprimindo a lista de classes que extendem carro");
        for(Carro carro : carros){
            System.out.println(carro.getMarca() + "-" + carro.getModelo());
        }
        System.out.println("");
    }

    public static void imprimirGeneric(List<?> lista){
        System.out.println("Método que funcionará para imprimir lista de <qualquer coisa>");
        for(Object st : lista ){
            System.out.println("Qualquer coisa: " + st);
        }
    }
}