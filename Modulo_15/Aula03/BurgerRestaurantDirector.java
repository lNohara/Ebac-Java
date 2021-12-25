package Modulo_15.Aula03;

public class BurgerRestaurantDirector {

    private BugerBuilder burgerBuilder;

    public void setBuilder(BugerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger buildBurger(){
        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildSalad();
        burgerBuilder.buildCheese();
        burgerBuilder.buldSauce();
        return burgerBuilder.build();
    }
}
