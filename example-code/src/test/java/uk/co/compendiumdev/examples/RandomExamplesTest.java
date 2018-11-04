package uk.co.compendiumdev.examples;


import org.junit.jupiter.api.Test;
import uk.co.compendiumdev.junitmigration.toassertj.Assert;

import java.util.Random;

public class RandomExamplesTest {

    @Test
    public void canGenerateRandomIntegers(){
        Random r = new Random();

        Assert.assertTrue(r.nextInt() >= Integer.MIN_VALUE);
        Assert.assertTrue(r.nextInt() <= Integer.MAX_VALUE);
    }

    @Test
    public void canGenerateRandomIntegersRange(){
        Random r = new Random();

        Assert.assertTrue(r.nextInt(24)<24);
        Assert.assertTrue(r.nextInt(24)>=0);
    }

    @Test
    public void doubleMightNeedToBeScaled(){

        Random r = new Random();

        for(int x=0; x<1000; x++){
            Double generated = r.nextDouble() * 25.0;

            Assert.assertTrue(generated >= 0.0);
            Assert.assertTrue(generated <= 25.0);

            System.out.println(r.nextDouble() * 25.0);
        }
    }
}
