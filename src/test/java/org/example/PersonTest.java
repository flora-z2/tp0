package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void getFullName_ShouldReturnFirstNameSpaceLastName() {
        Person person = new Person("Jean", "Dupont", 25);
        assertEquals("Jean Dupont", person.getFullName());
    }

    @Test
    void isAdult_ShouldReturnTrueWhenAgeIs18OrMore() {
        assertTrue(new Person("A", "B", 18).isAdult()); // Cas limite
        assertTrue(new Person("A", "B", 30).isAdult()); // Cas général
    }
}