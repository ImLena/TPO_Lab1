package domainModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ArthurTest {
    private Arthur arthur;
    final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        arthur = new Arthur();
        System.setOut(new PrintStream(output));
    }

    @ParameterizedTest
    @EmptySource
    public void isArthurConfidentWishing(String input) {
        arthur.printWish();
        assertEquals(output.toString(), input);
    }

    @ParameterizedTest
    @ValueSource(strings = {" Ему хотелось, чтобы здесь было что-нибудь простое и знакомое, за что можно было бы мысленно зацепиться.\n" +
            "Он чувствовал бы себя увереннее, если бы "})
    public void isArthurNotConfidentWishing(String input) {
        arthur.setConfident(false);
        arthur.printWish();
        assertEquals(output.toString(), input);
    }
}