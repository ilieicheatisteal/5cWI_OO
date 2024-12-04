package DataGenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataGeneratorTest {

    @Test
    void generateArray_ShouldCreateArrayWithCorrectSize() {
        // given
        int size = 5;

        // when
        int[] result = DataGenerator.generateArray(size);

        // then
        
        
        
        
        assertEquals(size, result.length);
    }   

    @Test
    void generateArray_ShouldCreateDifferentArraysOnMultipleCalls() {
        // given
        int size = 10;

        // when
        int[] firstArray = DataGenerator.generateArray(size);
        int[] secondArray = DataGenerator.generateArray(size);

        // then
        boolean allElementsEqual = true;
        for (int i = 0; i < size; i++) {
            if (firstArray[i] != secondArray[i]) {
                allElementsEqual = false;
                break;
            }
        }
        assertFalse(allElementsEqual, "Arrays should contain different values");
    }

    @Test
    void generateArrayInRange_ShouldCreateArrayWithCorrectSize() {
        // given
        int size = 5;
        int min = 1;
        int max = 10;

        // when
        int[] result = DataGenerator.generateArrayInRange(size, min, max);

        // then
        assertEquals(size, result.length);
    }

    @Test
    void generateArrayInRange_ShouldCreateArrayWithValuesInRange() {
        // given
        int size = 100; // larger size for better testing
        int min = 5;
        int max = 15;

        // when
        int[] result = DataGenerator.generateArrayInRange(size, min, max);

        // then
        for (int value : result) {
            assertTrue(value >= min && value <= max,
                    "Value " + value + " is outside the range [" + min + ", " + max + "]");
        }
    }
}