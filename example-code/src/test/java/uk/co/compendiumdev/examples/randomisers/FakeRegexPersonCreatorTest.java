package uk.co.compendiumdev.examples.randomisers;

import org.junit.Assert;
import org.junit.Test;
import uk.co.compendiumdev.domain.randomisers.FakePersonCreator;
import uk.co.compendiumdev.domain.randomisers.FakeRegexPersonCreator;
import uk.co.compendiumdev.domain.randomisers.RandomisedPersonCreator;

public class FakeRegexPersonCreatorTest {

    @Test
    public void canCreateRandomPerson(){

        final RandomisedPersonCreator pc = new FakeRegexPersonCreator();

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
    }

    @Test
    public void canCreateSpecificRandomPerson(){

        final FakeRegexPersonCreator pc = new FakeRegexPersonCreator(1234567890L);

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
        Assert.assertEquals("Vhsr", name);

        Assert.assertEquals("Vlqrvi", pc.getRandomFirstName());
        Assert.assertEquals("Xdmx", pc.getRandomFirstName());
        Assert.assertEquals("Ifqvm", pc.getRandomFirstName());
        Assert.assertEquals("Mutbueei", pc.getRandomFirstName());
        Assert.assertEquals("Fcdrdi", pc.getRandomFirstName());

    }
}
