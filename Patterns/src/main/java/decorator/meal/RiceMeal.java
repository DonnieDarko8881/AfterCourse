package decorator.meal;

public class RiceMeal extends Meal {
    @Override
    public void prepareMeal() {
        System.out.println("Przygotowywuje Ryżowy posiłek ");
    }
}
