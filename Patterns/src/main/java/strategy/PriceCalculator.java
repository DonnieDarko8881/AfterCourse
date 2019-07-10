package strategy;



public class PriceCalculator{
    private final PricingStrategy pricingStrategy;

    public PriceCalculator(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }
}
