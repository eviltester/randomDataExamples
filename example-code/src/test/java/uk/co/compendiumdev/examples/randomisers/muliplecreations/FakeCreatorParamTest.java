package uk.co.compendiumdev.examples.randomisers.muliplecreations;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import uk.co.compendiumdev.domain.randomisers.*;

import java.util.ArrayList;
import java.util.List;

public class FakeCreatorParamTest {

    /*
     * When testing randomize based code we really want to repeat the tests multiple times to be
     * more confident that it works. How much? Well, you have to decide based on the risk.
     */


    // use display name and paramaterized test name to make values checked obvious
    @DisplayName("Check FakeRegexPersonCreator Random Name passes acceptance criteria")
    @ParameterizedTest(name = "{0}")
    @MethodSource("createNamesWithFakeRegexPersonCreator")
    public void checkFakeRegexPersonCreatorNames(String name) {
        checkThatGivenNameIsBetweenThreeAndSevenChars(name);
    }

    public static String[] createNamesWithFakeRegexPersonCreator(){
        return createNames(new FakeRegexPersonCreator());
    }

    @DisplayName("Check FakeLetterifyPersonCreator Random Name passes acceptance criteria")
    @ParameterizedTest(name = "{0}")
    @MethodSource("createNamesWithFakeLetterifyPersonCreator")
    public void checkFakeLetterifyPersonCreatorNames(String name) {
        checkThatGivenNameIsBetweenThreeAndSevenChars(name);
    }

    public static String[] createNamesWithFakeLetterifyPersonCreator(){
        return createNames(new FakeLetterifyPersonCreator());
    }

    @DisplayName("Check FakeLetterifyPersonCreator Random Name passes acceptance criteria")
    @ParameterizedTest(name = "{0}")
    @MethodSource("createNamesWithFakePersonCreator")
    public void checkFakePersonCreatorNames(String name) {

        // because I'm using letterify I can't guarantee the length of name

        Assertions.assertNotNull(name);
        Assertions.assertTrue(
                Character.isUpperCase(name.charAt(0)),
                "should start with uppercase letter");
        //checkThatGivenNameIsBetweenThreeAndSevenChars(name);
    }

    public static String[] createNamesWithFakePersonCreator(){
        return createNames(new FakePersonCreator());
    }

    @DisplayName("Check RandomPersonCreator Random Name passes acceptance criteria")
    @ParameterizedTest(name = "{0}")
    @MethodSource("createNamesWithRandomPersonCreator")
    public void checkRandomPersonCreatorNames(String name) {
        checkThatGivenNameIsBetweenThreeAndSevenChars(name);
    }

    public static String[] createNamesWithRandomPersonCreator(){
        return createNames(new RandomPersonCreator());
    }


    public void checkThatGivenNameIsBetweenThreeAndSevenChars(String name){
        Assertions.assertTrue(
                name.length()>=3,
                "is less than 3 in length");

        Assertions.assertTrue(
                name.length()<=7,
                "is greater than 7 in length");

        Assertions.assertTrue(
                Character.isUpperCase(name.charAt(0)),
                "should start with uppercase letter");
    }






    public static String[] createNames(RandomisedPersonCreator creator){

        List<String> names = new ArrayList();

        for(int x=0;x<100;x++){
            names.add(creator.getRandomFirstName());
        }

        return names.toArray(new String[names.size()]);
    };


}
