package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {
    @ParameterizedTest
    @ValueSource(ints = {5,8,11})
    @DisplayName("check that 5,8,11 return Good Morning!")
    void checkForGoodMorning(int time) {
        Assertions.assertEquals("Good Morning!", Program.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,15,17})
    @DisplayName("check that 12,15,18 return Good Afternoon!")
    void checkForGoodAfternoon(int time) {
        Assertions.assertEquals("Good Afternoon!", Program.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,4,18,19,23})
    @DisplayName("check that 12,15,18 return Good Evening!")
    void checkForGoodEvening(int time) {
        Assertions.assertEquals("Good Evening!", Program.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,50,24})
    @DisplayName("check that 12,15,18 return Invalid time!")
    void checkForInvalidTime(int time) {
        Assertions.assertEquals("Invalid time!", Program.getGreeting(time));
    }
}
