package Modulo_15.Aula02;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class DemoSingleonPropriedade {
    public static void main(String[] args) {
        SingtonPropriedade singtonPropriedade = SingtonPropriedade.getIntance("Teste");
        System.out.println(singtonPropriedade.getValue());

        SingtonPropriedade singtonPropriedade1 = SingtonPropriedade.getIntance("Teste1");
        System.out.println(singtonPropriedade1.getValue());

        //Note que o objeto foi instanciado apenas uma vez
    }
}
