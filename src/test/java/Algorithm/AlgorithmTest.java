package Algorithm;

import algotithm.Algorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class AlgorithmTest {

    public static ArrayList<int[]> source = new ArrayList<>();
    public static ArrayList<int[]> results = new ArrayList<>();
    public Algorithm algorithm = new Algorithm();

    @BeforeAll
    public static void setValues() {
        source.add(new int[]{21, 28, 17, 6, 30, 19, 5, 13, 9, 26, 13, 15, 25, 25, 21, 3, 8, 4, 9, 13, 22, 28, 9, 2, 27, 20, 15, 14, 12, 15});
        results.add(new int[]{2, 3, 4, 5, 6, 8, 9, 9, 9, 12, 13, 13, 13, 14, 15, 15, 15, 17, 19, 20, 21, 21, 22, 25, 25, 26, 27, 28, 28, 30});
        source.add(new int[]{3, 27, 26, 7, 27, 30, 28, 30, 25, 3, 27, 26, 9, 8, 20, 10, 6, 7, 20, 9, 30, 5, 24, 4, 26, 13, 19, 24, 5, 1});
        results.add(new int[]{1, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10, 13, 19, 20, 20, 24, 24, 25, 26, 26, 26, 27, 27, 27, 28, 30, 30, 30});
        source.add(new int[]{17, 19, 16, 22, 9, 1, 16, 23, 15, 17, 16, 9, 14, 24, 11, 4, 13, 13, 9, 3, 12, 20, 5, 7, 6, 7, 21, 13, 10, 3});
        results.add(new int[]{1, 3, 3, 4, 5, 6, 7, 7, 9, 9, 9, 10, 11, 12, 13, 13, 13, 14, 15, 16, 16, 16, 17, 17, 19, 20, 21, 22, 23, 24});
    }


    private static Stream<Arguments> arraysProvider() {
        return Stream.of(
                Arguments.of(source.get(0), results.get(0)),
                Arguments.of(source.get(1), results.get(1)),
                Arguments.of(source.get(2), results.get(2))
        );
    }

    @ParameterizedTest
    @MethodSource("arraysProvider")
    @DisplayName("╯°□°）╯")
    public void testCountingSort(int[] input, int[] output) {
        input = algorithm.simpleCountingSort(input);
        Assertions.assertEquals(Arrays.toString(Arrays.stream(input).toArray()), Arrays.toString(Arrays.stream(output).toArray()));

    }
}
