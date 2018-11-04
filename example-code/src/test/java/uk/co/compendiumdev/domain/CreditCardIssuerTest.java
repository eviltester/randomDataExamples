package uk.co.compendiumdev.domain;


import org.junit.jupiter.api.Test;
import uk.co.compendiumdev.junitmigration.toassertj.Assert;

public class CreditCardIssuerTest {

    @Test
    public void canIssueToWhenOver18(){
        Person amOver18 = new Person("Over", "Eighteen", 19);

        Assert.assertTrue(
                "Should be able to issue credit card to 18",
                new CreditCardIssuer().canIssueCreditCardTo(amOver18));

    }

    @Test
    public void cannotIssueToWhenUnder18(){
        Person amUnder18 = new Person("Over", "Eighteen", 17);

        Assert.assertFalse(
                "Should not be able to issue cards to people under 18",
                new CreditCardIssuer().canIssueCreditCardTo(amUnder18));

    }
}
