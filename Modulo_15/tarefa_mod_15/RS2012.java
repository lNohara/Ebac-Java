package Modulo_15.tarefa_mod_15;

public class RS2012 extends Car{

    public RS2012(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For uber comfort grade A drivers");
    }
}
