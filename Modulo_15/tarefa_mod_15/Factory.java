package Modulo_15.tarefa_mod_15;

public abstract class Factory {
    public Car create(String requestGrade){
        Car car = retriveCar(requestGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car){
        car.carPresentation();
        car.carDetails();
        car.carCheckList();
        System.out.println("***********************************");
        return car;
    }

    abstract Car retriveCar(String requestGrade);
}
