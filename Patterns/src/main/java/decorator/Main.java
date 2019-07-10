package decorator;

import decorator.meal.ChickenMealDecorator;
import decorator.meal.Meal;
import decorator.meal.PotatoMeal;
import decorator.meal.SauseMealDecorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nowy Posiłek ...");
        Meal potatoMealWithChickenAndSauce = new SauseMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();
    }
}
