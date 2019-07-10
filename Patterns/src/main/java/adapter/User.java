package adapter;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class User {
    private final String firstName;
    private final String lastName;
    private final String pesel;


    public User(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;

    }

    public LocalDate getDateOfBirth(){
        return LocalDate.of(Integer.valueOf("19"+pesel.substring(0, 2)),
                Integer.valueOf(pesel.substring(2, 4)),
                Integer.valueOf(pesel.substring(4, 6)));
    }
}

