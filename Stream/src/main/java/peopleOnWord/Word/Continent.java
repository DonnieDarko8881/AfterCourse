package peopleOnWord.Word;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Continent {
    private Set<Country> CountriesOnContinent = new HashSet<>();

    public void addCountryToContinent(Country country){
        CountriesOnContinent.add(country);
    }
}
