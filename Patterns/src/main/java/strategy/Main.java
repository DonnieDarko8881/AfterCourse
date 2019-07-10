package strategy;

public class Main {
    public static void main(String[] args) {
        //Użytkownik nie jest zapisany do newslettera - normalna cena
        PriceCalculator priceCalculator = new PriceCalculator(new RegularPrice());
        priceCalculator.calculate(100, false);
        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.calculate(100, true);
        //Użytkownik jest zapisany do newslettera
        PriceCalculator priceCalculatorNewsletter = new PriceCalculator(new SalePrice());
        priceCalculatorNewsletter.calculate(100, true);
        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculatorNewsletter.calculate(100, false);
    }
}
