package strategy;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("cena" + price * 0.5);
        } else {
            System.out.println("zła strategia");
        }
    }
}
