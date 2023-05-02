package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ClassificationTests {

    @ParameterizedTest
    @ValueSource(ints = {-1,500,128})
    @DisplayName("check that -1,500,128 return Invalid Age!")
    void checkForInvalidAge(int age) {
        Assertions.assertEquals("Invalid Age!", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,3})
    @DisplayName("check that 0,1,3 return See guidance for specific film.")
    void checkForUnder4(int age) {
        Assertions.assertEquals("See guidance for specific film.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {4,7})
    @DisplayName("check that 4,7 return U rated films are available.")
    void checkForUnder8(int age) {
        Assertions.assertEquals("U rated films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {8,11})
    @DisplayName("check that 8,11 return U & PG rated films are available.")
    void checkForUnder12(int age) {
        Assertions.assertEquals("U & PG rated films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,14})
    @DisplayName("check that 12,14 return U, PG & 12 rated films are available.")
    void checkForUnder15(int age) {
        Assertions.assertEquals("U, PG & 12 rated films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,17})
    @DisplayName("check that 15,17 return U, PG, 12 & 15 rated films are available.")
    void checkForUnder18(int age) {
        Assertions.assertEquals("U, PG, 12 & 15 rated films are available.", FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18,50,100,127})
    @DisplayName("check that 18,50,100,127 return All films are available.")
    void checkForOver18(int age) {
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(age));
    }
}
