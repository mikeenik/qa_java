package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private int actualKittensCount;
    private int expectedKittensCount;
    private Feline feline = new Feline();

    public FelineParameterizedTest(int kittensCount, int expected) {
        this.actualKittensCount = kittensCount;
        this.expectedKittensCount = expected;
    }

    @Parameterized.Parameters
    public static Object[] getKittensCount() {
        return new Object[][]{{0, 0}, {1, 1}, {10, 10}};
    }

    @Test
    public void getKittensParametrizedTest() {
        assertEquals(expectedKittensCount, feline.getKittens(actualKittensCount));
    }
}
