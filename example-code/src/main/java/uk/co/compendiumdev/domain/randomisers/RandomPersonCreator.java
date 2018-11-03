package uk.co.compendiumdev.domain.randomisers;

import java.util.Random;

public class RandomPersonCreator implements RandomisedPersonCreator{

    Random r;

    public RandomPersonCreator(){
        r = new Random();
    }

    public RandomPersonCreator(final long seed) {
        r = new Random(seed);
    }

    public String getRandomFirstName(){

        String[] nameChoices = {"Bob", "Alan", "Fred", "Dale", "Tim"};

        return nameChoices[
                r.nextInt(nameChoices.length)];

    }
}
