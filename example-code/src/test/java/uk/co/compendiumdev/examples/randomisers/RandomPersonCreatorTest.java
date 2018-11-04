package uk.co.compendiumdev.examples.randomisers;

import org.junit.jupiter.api.Test;
import uk.co.compendiumdev.domain.randomisers.RandomPersonCreator;
import uk.co.compendiumdev.junitmigration.toassertj.Assert;

public class RandomPersonCreatorTest {

    @Test
    public void canCreateRandomPerson(){

        final RandomPersonCreator pc = new RandomPersonCreator();

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
    }

    @Test
    public void canCreateSpecificRandomPerson(){

        final RandomPersonCreator pc = new RandomPersonCreator(1234567890L);

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
        Assert.assertEquals("Fred", name);

        Assert.assertEquals("Fred", pc.getRandomFirstName());
        Assert.assertEquals("Alan", pc.getRandomFirstName());
        Assert.assertEquals("Fred", pc.getRandomFirstName());
        Assert.assertEquals("Bob", pc.getRandomFirstName());
        Assert.assertEquals("Alan", pc.getRandomFirstName());

    }
}
