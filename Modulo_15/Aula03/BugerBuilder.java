package Modulo_15.Aula03;

public abstract class BugerBuilder {

    Burger burger = new Burger();
    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildSalad();
    abstract void buildCheese();
    abstract void buldSauce();

    Burger build(){
        return burger;
    };
}
