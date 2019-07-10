package decorator.meal;

public class PotatoMeal extends Meal{
    @Override
    public void prepareMeal() {
        System.out.println("Przygotowywuje posiłek na bazie ziemniaków");
    }
}
