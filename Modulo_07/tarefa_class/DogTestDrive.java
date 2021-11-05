package Modulo_07.tarefa_class;

public class DogTestDrive {
    public static void main(String[] args) {

        Dog smallDog = new Dog();
        smallDog.makeNoise();
        smallDog.bark(10.0);

        System.out.println("**********************");
        Dog mediumDog = new Dog();
        mediumDog.setSize(15);
        mediumDog.bark(mediumDog.getSize());
    }
}
