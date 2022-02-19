
package domainModelTest;

import domainModel.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DomainModelTest{

    static Location location;
    private static final String story = "У Форда в руке был стеклянный флакончик, в котором плавала, переливаясь, маленькая желтая рыбка.\n" +
            "Артур смотрел на него, моргая глазами. Ему хотелось, чтобы здесь было что-нибудь простое и знакомое, за что можно было бы мысленно зацепиться.\n" +
            "Он чувствовал бы себя увереннее, если бы рядом с нижним бельем дентрасси, скворншельскими матрацами и человеком с Бетельгейзе," +
            "\nдержащим маленькую рыбку и предлагающим засунуть ее в ухо, он увидел, к примеру, пакет кукурузных хлопьев.\n";

    @BeforeEach
    public void createLocation() {
        location = new Location();
    }

    @ParameterizedTest
    @ValueSource(strings = {story})
    public void testString(String input) {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        location.makeStory();
        Assertions.assertEquals(input, output.toString());
    }

    @ParameterizedTest
    @EmptySource
    public void isArthurConfidentWishing(String input) {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        location.getArthur().printWish();
        Assertions.assertEquals(output.toString(), input);

    }

    @Test
    public void canFordTakeFlacon() {
        Assertions.assertTrue(location.getFord().tryTakeFlacon());
    }

    @Test
    public void hasFish() {
        Flacon flacon = new Flacon("стеклянный");
        flacon.getFlaconDescription();
        Assertions.assertTrue(flacon.isHasFish());
    }

    @Test
    public void canFordGiveOfferWithoutFlacon() {
        Assertions.assertFalse(location.getFord().tryOffer());
    }

    @Test
    public void canFordGiveOfferWithFlacon() {
        location.getFord().tryTakeFlacon();
        Assertions.assertTrue(location.getFord().tryOffer());
    }

}
