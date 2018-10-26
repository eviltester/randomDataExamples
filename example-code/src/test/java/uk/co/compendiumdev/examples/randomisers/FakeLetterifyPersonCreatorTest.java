package uk.co.compendiumdev.examples.randomisers;

import org.junit.Assert;
import org.junit.Test;
import uk.co.compendiumdev.domain.randomisers.FakeLetterifyPersonCreator;
import uk.co.compendiumdev.domain.randomisers.FakePersonCreator;
import uk.co.compendiumdev.domain.randomisers.FakeRegexPersonCreator;
import uk.co.compendiumdev.domain.randomisers.RandomisedPersonCreator;

public class FakeLetterifyPersonCreatorTest {

    @Test
    public void canCreateRandomPerson(){

        final RandomisedPersonCreator pc = new FakeLetterifyPersonCreator();

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
    }

    @Test
    public void canCreateSpecificRandomPerson(){

        final RandomisedPersonCreator pc = new FakeLetterifyPersonCreator(1234567890L);

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
        Assert.assertEquals("Mjdpgo", name);

        Assert.assertEquals("Umjrnp", pc.getRandomFirstName());
        Assert.assertEquals("Wqden", pc.getRandomFirstName());
        Assert.assertEquals("Olbcn", pc.getRandomFirstName());
        Assert.assertEquals("Bzdpt", pc.getRandomFirstName());
        Assert.assertEquals("Vokbk", pc.getRandomFirstName());

    }
}
