package br.com.lnohara.mod19.aula04.fabrica;

import br.com.lnohara.mod19.aula04.domain.Persistente;

public interface FabricaPersistente {

    /**
     * Método que sabe criar objetos da aplicação
     *
     * @param dados São os dados a serem cadastrados no banco de dados
     * @return Retorna o objeto <b>Persistente</b> que é pai de todas as entidades da aplicação
     */
    Persistente criarObjeto(String dados[]);

}
