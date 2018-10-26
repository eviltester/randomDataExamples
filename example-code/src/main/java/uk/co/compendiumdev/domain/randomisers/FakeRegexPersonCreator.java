package uk.co.compendiumdev.domain.randomisers;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import uk.co.compendiumdev.domain.randomisers.RandomisedPersonCreator;

import java.util.Locale;
import java.util.Random;

public class FakeRegexPersonCreator implements RandomisedPersonCreator {

    RandomService rnd;
    FakeValuesService f;

    public FakeRegexPersonCreator(){
        rnd = new RandomService();
        f = new FakeValuesService(new Locale("en-GB"), rnd);
    }

    public FakeRegexPersonCreator(final long seed) {
        rnd = new RandomService(new Random(seed));
        f = new FakeValuesService(new Locale("en-GB"), rnd);
    }



    @Override
    public String getRandomFirstName() {

        final Integer len = rnd.nextInt(3, 7);   // name length between 3 and 7

        //"[A-Z][a-z]{3,7}"
        return f.regexify(String.format("[A-Z][a-z]{3,%d}",len));

    }
}
