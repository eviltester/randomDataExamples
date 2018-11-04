package uk.co.compendiumdev.examples.randomisers;


import org.junit.jupiter.api.Test;
import uk.co.compendiumdev.domain.randomisers.FakePersonCreator;
import uk.co.compendiumdev.junitmigration.toassertj.Assert;

public class FakePersonCreatorTest {

    @Test
    public void canCreateRandomPerson(){

        final FakePersonCreator pc = new FakePersonCreator();

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
    }

    @Test
    public void canCreateSpecificRandomPerson(){

        final FakePersonCreator pc = new FakePersonCreator(1234567890L);

        final String name = pc.getRandomFirstName();

        Assert.assertNotNull(name);
        Assert.assertTrue(name.length() > 2);
        Assert.assertEquals("Corine", name);

        Assert.assertEquals("Brett", pc.getRandomFirstName());
        Assert.assertEquals("Juanita", pc.getRandomFirstName());
        Assert.assertEquals("Halle", pc.getRandomFirstName());
        Assert.assertEquals("Karl", pc.getRandomFirstName());
        Assert.assertEquals("Ansel", pc.getRandomFirstName());

    }
}
