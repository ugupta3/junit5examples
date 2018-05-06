package com.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisabledTest {

    @Disabled
    @Test
    void testWillBeSkipped() {
        assertEquals(2, 1, "2 is not equal to 1");
    }

    @Test
    void testWillBeExecuted() {

    }
}