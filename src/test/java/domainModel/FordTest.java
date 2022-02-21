package domainModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordTest {
    private Ford ford;

    @BeforeEach
    void setUp() {
        ford = new Ford();
    }

    @Test
    void tryTakeFlacon() {
        assertTrue(ford.tryTakeFlacon());
    }

    @Test
    void fordsDescription() {
    }

    @Test
    void tryOfferWithoutFlacon() {
        assertFalse(ford.tryOffer());
    }

    @Test
    void tryOfferWithFlacon() {
        ford.tryTakeFlacon();
        assertTrue(ford.tryOffer());
    }

    @Test
    void tryOfferWithoutFish() {
        ford.tryTakeFlacon();
        ford.getFlacon().setHasFish(false);
        assertFalse(ford.tryOffer());
    }
}