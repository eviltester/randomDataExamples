package uk.co.compendiumdev.domain.randomisers;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;
import java.util.Random;

public class FakeLetterifyPersonCreator implements RandomisedPersonCreator {

    RandomService rnd;
    FakeValuesService f;

    public FakeLetterifyPersonCreator(){
        rnd = new RandomService();
        f = new FakeValuesService(new Locale("en-GB"), rnd);
    }

    public FakeLetterifyPersonCreator(final long seed) {
        rnd = new RandomService(new Random(seed));
        f = new FakeValuesService(new Locale("en-GB"), rnd);
    }


    @Override
    public String getRandomFirstName() {

        final Integer len = rnd.nextInt(3, 7);   // name length between 3 and 7

        return String.format("%s%s",
                            f.letterify("?",true),
                            f.letterify("??????????".substring(0,len-1), false));
    }
}
