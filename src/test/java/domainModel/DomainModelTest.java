
package domainModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class DomainModelTest{

    Location location;
    private final String STORY = "У Форда в руке был стеклянный флакончик, в котором плавала, переливаясь, маленькая желтая рыбка.\n" +
            "Артур смотрел на него, моргая глазами. Ему хотелось, чтобы здесь было что-нибудь простое и знакомое, за что можно было бы мысленно зацепиться.\n" +
            "Он чувствовал бы себя увереннее, если бы рядом с нижним бельем дентрасси, скворншельскими матрацами и человеком с Бетельгейзе," +
            "\nдержащим маленькую рыбку и предлагающим засунуть ее в ухо, он увидел, к примеру, пакет кукурузных хлопьев.\n";

    @BeforeEach
    public void setUp() {
        location = new Location();
    }

    @ParameterizedTest
    @ValueSource(strings = {STORY})
    public void testString(String input) {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        location.makeStory();
        assertEquals(input, output.toString());
    }
}
