package Modulo_17.trefa_mod_17.Chevrolet;

public class Camaro extends Chevrolet{
    @Override
    public String getModelo() {
        return "Camaro";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
