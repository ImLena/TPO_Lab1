package algorithm;

import algotithm.Algorithm;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AlgorithmTest {

    private List<int[]> source;
    private List<int[]> zeros;
    private List<int[]> results;
    private Algorithm algorithm;

    @BeforeAll
    public void setUp() {
        source = new ArrayList<>();
        zeros = new ArrayList<>();
        results = new ArrayList<>();
        algorithm = new Algorithm();
        zeros.add(new int[]{0, 0, 1, 1, 1, 1, 1, 0, 1, 3, 0, 0, 1, 3, 1, 3, 0, 1, 0, 1, 1, 2, 1, 0, 0, 2, 1, 1, 2, 0, 1});
        source.add(new int[]{21, 28, 17, 6, 30, 19, 5, 13, 9, 26, 13, 15, 25, 25, 21, 3, 8, 4, 9, 13, 22, 28, 9, 2, 27, 20, 15, 14, 12, 15});
        results.add(new int[]{2, 3, 4, 5, 6, 8, 9, 9, 9, 12, 13, 13, 13, 14, 15, 15, 15, 17, 19, 20, 21, 21, 22, 25, 25, 26, 27, 28, 28, 30});
        source.add(new int[]{3, 27, 26, 7, 27, 30, 28, 30, 25, 3, 27, 26, 9, 8, 20, 10, 6, 7, 20, 9, 30, 5, 24, 4, 26, 13, 19, 24, 5, 1});
        zeros.add(new int[]{0, 1, 0, 2, 1, 2, 1, 2, 1, 2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 2, 1, 3, 3, 1, 0, 3});
        results.add(new int[]{1, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10, 13, 19, 20, 20, 24, 24, 25, 26, 26, 26, 27, 27, 27, 28, 30, 30, 30});
        source.add(new int[]{17, 19, 16, 22, 9, 1, 16, 23, 15, 17, 16, 9, 14, 24, 11, 4, 13, 13, 9, 3, 12, 20, 5, 7, 6, 7, 21, 13, 10, 3});
        zeros.add(new int[]{0, 1, 0, 2, 1, 1, 1, 2, 0, 3, 1, 1, 1, 3, 1, 1, 3, 2, 0, 1, 1, 1, 1, 1, 1});
        results.add(new int[]{1, 3, 3, 4, 5, 6, 7, 7, 9, 9, 9, 10, 11, 12, 13, 13, 13, 14, 15, 16, 16, 16, 17, 17, 19, 20, 21, 22, 23, 24});
        source.add(new int[]{21, 18, 10, 2, 29, 14, 16, 4, 17, 7, 27, 11, 23, 9, 18, 13, 4, 0, 17, 3, 23, 27, 15, 27, 2, 27, 26, 24, 9, 8});
        zeros.add(new int[]{1, 0, 2, 1, 2, 0, 0, 1, 1, 2, 1, 1, 0, 1, 1, 1, 1, 2, 2, 0, 0, 1, 0, 2, 1, 0, 1, 4, 0, 1});
        results.add(new int[]{0, 2, 2, 3, 4, 4, 7, 8, 9, 9, 10, 11, 13, 14, 15, 16, 17, 17, 18, 18, 21, 23, 23, 24, 26, 27, 27, 27, 27, 29});

    }


    private Stream<Arguments> arraysProvider() {
        return Stream.of(
                Arguments.of(source.get(0), results.get(0)),
                Arguments.of(source.get(1), results.get(1)),
                Arguments.of(source.get(2), results.get(2)),
                Arguments.of(source.get(3), results.get(3))
        );
    }

    private Stream<Arguments> zeroArrayProvider() {
        return Stream.of(
                Arguments.of(source.get(0), zeros.get(0)),
                Arguments.of(source.get(1), zeros.get(1)),
                Arguments.of(source.get(2), zeros.get(2)),
                Arguments.of(source.get(3), zeros.get(3))
        );
    }

    @ParameterizedTest(name = "Test {index}")
    @MethodSource("arraysProvider")
    @DisplayName("╯°□°）╯")
    public void testCountingSort(int[] input, int[] output) {
        int[] res = algorithm.simpleCountingSort(input);
        assertEquals(Arrays.toString(Arrays.stream(res).toArray()), Arrays.toString(Arrays.stream(output).toArray()));

    }

    @ParameterizedTest(name = "Test {index}")
    @MethodSource("zeroArrayProvider")
    @DisplayName("Tests for zeros array")
    public void testZerosArray(int[] input, int[] output) {
        int[] res = algorithm.countValues(input);
        assertEquals(Arrays.toString(Arrays.stream(res).toArray()), Arrays.toString(Arrays.stream(output).toArray()));

    }

    @Test
    public void testNegativeValues() {
        int[] sourceArray = {-1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> algorithm.simpleCountingSort(sourceArray));
    }

    @Test
    public void testBigValues() {
        int[] sourceArray = {1001, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> algorithm.simpleCountingSort(sourceArray));
    }
}
