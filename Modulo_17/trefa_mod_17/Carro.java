package Modulo_17.trefa_mod_17;

public interface  Carro {
    public abstract String getMarca();

    public default String getModelo(){
        return "Modelo";
    }
}
