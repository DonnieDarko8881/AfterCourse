package decorator.meal;

public class SauseMealDecorator extends MealDecorator {
    public SauseMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Do potrawy dodaję sosu");
    }
}
