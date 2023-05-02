package com.sparta.mua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTests {
    @Test
    @DisplayName("check that 7 return Good Morning")
    void checkForGoodMorning() {
        Assertions.assertEquals("Good Morning!", Program.getGreeting(7));
    }
}
