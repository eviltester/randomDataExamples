package uk.co.compendiumdev.examples.randomisers;




import org.junit.jupiter.api.Test;
import uk.co.compendiumdev.domain.randomisers.FakeLetterifyPersonCreator;
import uk.co.compendiumdev.domain.randomisers.RandomisedPersonCreator;
import uk.co.compendiumdev.junitmigration.tojunit5.Assert;

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

        Assert.assertNotNull("name should not be null", name);
        Assert.assertTrue(name.length() > 2);
        Assert.assertEquals("Sfcpi", name);

        Assert.assertEquals("Cjbxjfz", pc.getRandomFirstName());
        Assert.assertEquals("Fzia", pc.getRandomFirstName());
        Assert.assertEquals("Nulv", pc.getRandomFirstName());
        Assert.assertEquals("Vrrekl", pc.getRandomFirstName());
        Assert.assertEquals("Yaq", pc.getRandomFirstName());

    }
}
