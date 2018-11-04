package uk.co.compendiumdev.junitmigration.toassertj;

import static org.assertj.core.api.Assertions.assertThat;

public class Assert {

    public static void assertNotNull(final String actual) {
        assertThat(actual).isNotNull();
    }

    public static void assertNotNull(final String message, final String actual) {
        assertThat(actual).isNotNull().overridingErrorMessage(message);
    }

    public static void assertTrue(final boolean b) {
        assertThat(b).isTrue();
    }

    public static void assertEquals(final String expected, final String actual) {
        assertThat(actual).isEqualTo(expected);
    }

    public static void assertTrue(final String message, final boolean b) {
        assertThat(b).isTrue().overridingErrorMessage(message);

    }

    public static void assertFalse(final String message, final boolean b) {
        assertThat(b).isFalse();
    }
}
