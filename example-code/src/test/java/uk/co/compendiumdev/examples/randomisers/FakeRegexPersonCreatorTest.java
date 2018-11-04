package uk.co.compendiumdev.examples.randomisers;


import org.junit.jupiter.api.Test;

import uk.co.compendiumdev.domain.randomisers.FakeRegexPersonCreator;
import uk.co.compendiumdev.domain.randomisers.RandomisedPersonCreator;
import uk.co.compendiumdev.junitmigration.toassertj.Assert;

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
        Assert.assertEquals("Vhs", name);

        Assert.assertEquals("Vlqii", pc.getRandomFirstName());
        Assert.assertEquals("Xdmhsfo", pc.getRandomFirstName());
        Assert.assertEquals("Ifq", pc.getRandomFirstName());
        Assert.assertEquals("Mutfpm", pc.getRandomFirstName());
        Assert.assertEquals("Fcdm", pc.getRandomFirstName());

    }
}
