package peopleOnWord.Word;

import java.math.BigDecimal;

public class Country {
    private BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        return this.peopleQuantity;
    }
}
