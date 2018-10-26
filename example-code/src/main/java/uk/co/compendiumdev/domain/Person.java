package uk.co.compendiumdev.domain;

public class Person {

    String firstName;
    String lastName;
    int age;

    public Person(String aFirstName, String aLastName, int anAge){
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.age = anAge;
    }

    public int getAge() {
        return age;
    }
}
