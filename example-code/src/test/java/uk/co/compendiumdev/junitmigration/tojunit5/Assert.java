package uk.co.compendiumdev.junitmigration.tojunit5;

import org.junit.jupiter.api.Assertions;

public class Assert {
    public static void assertNotNull(final String actual) {
        Assertions.assertNotNull(actual);
    }

    public static void assertNotNull(final String message, final String actual) {
        Assertions.assertNotNull(actual, message);
    }

    public static void assertTrue(final boolean b) {
        Assertions.assertTrue(b);
    }

    public static void assertEquals(final String expected, final String actual) {
        Assertions.assertEquals(expected,actual);
    }

    public static void assertTrue(final String message, final boolean b) {
        Assertions.assertTrue(b, message);
    }

    public static void assertFalse(final String message, final boolean b) {
        Assertions.assertFalse(b, message);
    }
}
