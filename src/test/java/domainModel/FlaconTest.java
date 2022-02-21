package domainModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlaconTest {

    private Flacon flacon;

    @BeforeEach
    void setUp() {
        flacon = new Flacon("стеклянный");
    }

    @Test
    void isHasFishInFlacon() {
        flacon.getFlaconDescription();
        assertTrue(flacon.isHasFish());
    }

    @Test
    void isHasFishWithoutFlacon() {
        assertFalse(flacon.isHasFish());
    }
}