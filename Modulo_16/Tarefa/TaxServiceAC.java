package Modulo_16.Tarefa;

public class TaxServiceAC implements ITaxService{
    @Override
    public double tax(double tax) {
        return tax * 0.5;
    }
}
