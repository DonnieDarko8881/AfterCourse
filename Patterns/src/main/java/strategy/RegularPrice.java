package strategy;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("cena regularna " + price);
        } else {
            System.out.println("zła strategia");
        }
    }
}
