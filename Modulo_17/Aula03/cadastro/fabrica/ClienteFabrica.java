package Modulo_17.Aula03.cadastro.fabrica;

import Modulo_17.Aula03.cadastro.domain.Cliente;
import Modulo_17.Aula03.cadastro.domain.Persistente;

public class ClienteFabrica implements FabricaPersistente{
    @Override
    public Persistente criarObjeto(String dadosSeparados[]) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }

}
