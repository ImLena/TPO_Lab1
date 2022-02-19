package arccos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static java.lang.Float.NaN;

import java.util.stream.Stream;

public class ArccosTest {

    private static Stream<Arguments> testArccos() {
        return Stream.of(
                Arguments.of(-1, 0.0),
                Arguments.of(-0.9, 2.69),
                Arguments.of(-0.7, 2.35),
                Arguments.of(-0.5, 2.1),
                Arguments.of(-0.3, 1.88),
                Arguments.of(-0.1, 1.68),
                Arguments.of(0, 1.58),
                Arguments.of(0.2, 1.37),
                Arguments.of(0.4, 1.16),
                Arguments.of(0.6, 0.93),
                Arguments.of(0.8, 0.65),
                Arguments.of(1, 0),
                Arguments.of(-2, NaN),
                Arguments.of(2, NaN)
        );
    }


    @ParameterizedTest(name = "{index}: arccos({0}) = {1}")
    @MethodSource
    @DisplayName("(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧")
    public void testArccos(double in, double out) {
        double expected, actual;
        Arccos arccos = new Arccos();
        expected = out;
        actual = arccos.arccos(in);
        System.out.println("x = " + in + " actual = " + actual
                + " expected = " + expected);
        Assertions.assertEquals(expected, actual, arccos.getAccurate());

    }
}
