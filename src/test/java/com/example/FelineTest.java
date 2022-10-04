package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    private Feline feline = new Feline();

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
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
    }
}