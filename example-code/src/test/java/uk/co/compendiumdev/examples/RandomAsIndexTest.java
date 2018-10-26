package uk.co.compendiumdev.examples;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomAsIndexTest {

    @Test
    public void chooseRandomNameFromArray(){

        Random r = new Random();

        String[] namesAvailable = {"Bob", "Alan", "Fred",
                                  "Dale", "Tim"};

        List<String> nameChoices = Arrays.asList(namesAvailable);

        for(int x=0; x<1000 ; x++) {

            int nameIndex = r.nextInt(namesAvailable.length);
            String nameChosen = namesAvailable[nameIndex];
            System.out.println(nameChosen);

            Assert.assertTrue(nameChoices.contains(nameChosen));
        }

    }


@Test
public void seededChooseRandomNameFromArray(){

    String[] namesAvailable = {"Bob", "Alan", "Fred",
                                "Dale", "Tim"};

    for(int x=0; x<1000 ; x++) {

        Random r = new Random(12345678L);

        int nameIndex = r.nextInt(namesAvailable.length);

        Assert.assertEquals("Dale", namesAvailable[nameIndex]);
    }
}
}
