package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class PersonParameterizedTest {
    @ParameterizedTest
    @ValueSource(ints = {18, 20, 99})
    void isAdult_ShouldReturnTrueForAdults(int age) {
        assertTrue(new Person("Test", "Test", age).isAdult());
    }
}