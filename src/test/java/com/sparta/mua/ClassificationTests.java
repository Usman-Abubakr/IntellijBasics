package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ClassificationTests {
    @ParameterizedTest
    @ValueSource(ints = {1,6,11,12})
    @DisplayName("check that 1,6,11,12 return U, PG & 12 films are available.")
    void checkForUnder12(int age) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {13,15})
    @DisplayName("check that 13,15 return U, PG, 12 & 15 films are available.")
    void checkForUnder15(int age) {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {16,18,50,127})
    @DisplayName("check that 16,18,50,127 return All films are available.")
    void checkForAll(int age) {
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,500,128})
    @DisplayName("check that -1,500,128 return Invalid Age!")
    void checkForInvalidAge(int age) {
        Assertions.assertEquals("Invalid Age!", FilmClassifications.availableClassifications(age));
    }
}
