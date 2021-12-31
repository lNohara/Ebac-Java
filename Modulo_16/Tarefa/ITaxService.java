package Modulo_16.Tarefa;

public interface ITaxService {
    public default double tax(double tax){
        return tax * 0.3;
    }
}
