package Modulo_17.Aula03.cadastro.fabrica;

import Modulo_17.Aula03.cadastro.domain.Persistente;
import Modulo_17.Aula03.cadastro.domain.Produto;

public class ProdutoFabrica implements FabricaPersistente {
    @Override
    public Persistente criarObjeto(String[] dados) {
        Produto produto = new Produto();
        produto.setCodigo(Long.parseLong(dados[0].trim()));
        produto.setNome(dados[1]);
        return produto;
    }
}
