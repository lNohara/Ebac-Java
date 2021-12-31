package Modulo_16.Tarefa;

public class TaxServiceSP implements ITaxService{
    @Override
    public double tax(double tax) {
        return tax * 0.1;
    }
}
