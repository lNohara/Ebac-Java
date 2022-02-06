package Modulo_17.trefa_mod_17.Jeep;

public class Commander extends Jeep{
    @Override
    public String getModelo() {
        return "Commander";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
