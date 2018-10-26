package uk.co.compendiumdev.domain.randomisers;

import com.github.javafaker.Faker;

import java.util.Random;

public class FakePersonCreator implements RandomisedPersonCreator {

    Faker f;

    public FakePersonCreator(){
        f = new Faker();
    }

    public FakePersonCreator(final long seed) {

        f = new Faker(new Random(seed));
    }

    public String getRandomFirstName(){

        return f.name().firstName();

    }
}



// see also https://github.com/mirreck/java-fake-factory