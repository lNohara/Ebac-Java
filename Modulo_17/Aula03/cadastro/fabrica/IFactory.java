package Modulo_17.Aula03.cadastro.fabrica;

public interface IFactory {
    /**
     * Método que sabe qual fábrica será criada
     *
     * @param opcaoMenuGeral Opção selecionada no menu inicial da aaplicação - <b>1 para cliente e 2 para produto</b>
     * @return FabricaPersistente que sabe criar objetos
     */
    FabricaPersistente criarFabrica(String opcaoMenuGeral);
}
