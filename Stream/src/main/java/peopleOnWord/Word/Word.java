package peopleOnWord.Word;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
public class Word {
    private Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleOnTheWord = continents.stream()
                .flatMap(continent -> continent.getCountriesOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return peopleOnTheWord;
    }
}
