package uk.co.compendiumdev.examples.randomisers.muliplecreations;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import uk.co.compendiumdev.domain.randomisers.*;
import uk.co.compendiumdev.junitmigration.tojunit5.Assert;

import java.util.ArrayList;
import java.util.List;

public class FakeCreatorLoopTest {

    /*
     * When testing randomize based code we really want to repeat the tests multiple times to be
     * more confident that it works. How much? Well, you have to decide based on the risk.
     */



    @Test
    public void checkThatNameIsBetweenThreeAndSevenChars(){

        RandomisedPersonCreator creator = new FakeRegexPersonCreator();

        for(int x=0;x<100;x++){


            String name = creator.getRandomFirstName();

            // hard to know how many we checked so system out the info
            System.out.println(name);
            System.out.println(name.length());

            // assertions are the 'wrong' way round in JUnit 5 so to save migration time I brought in
            // JUnit vintage engine
            Assert.assertTrue(String.format("%s is less than 3 in length", name),
                    name.length()>=3);
            Assert.assertTrue(String.format("%s is greater than 7 in length", name),
                    name.length()<=7);

            Assert.assertTrue(String.format("%s should start with uppercase letter", name),
                    Character.isUpperCase(name.charAt(0)));

        }
    }




}
