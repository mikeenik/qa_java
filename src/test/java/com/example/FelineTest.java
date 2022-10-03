package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    private int actualKittensCount;
    private int expectedKittensCount;
    private Feline feline = new Feline();

    public FelineTest(int kittensCount, int expected) {
        this.actualKittensCount = kittensCount;
        this.expectedKittensCount = expected;
    }
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters
    public static Object[] getKittensCount() {
        return new Object[][]{{0, 0}, {1, 1}, {10, 10}};
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensParametrizedTest() {
        assertEquals(expectedKittensCount, feline.getKittens(actualKittensCount));
    }

    @Test
    public void getKittensNotParametrizedTest() {
        feline.getKittens();
        assertEquals(expectedKittensCount, feline.getKittens(actualKittensCount));

    }
}