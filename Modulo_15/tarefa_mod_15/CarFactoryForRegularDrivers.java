package Modulo_15.tarefa_mod_15;

public class CarFactoryForRegularDrivers extends Factory{
    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade) {
            case "A":
                return new Linea2012("Dark Green", "Fiat", 2012);
            case "B":
                return new Linea2011("Silver", "Fiat", 2011);
            default:
                System.out.println("Invalid Grade");
                return null;
        }
    }
}
