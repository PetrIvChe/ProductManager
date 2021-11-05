package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartphoneTest {

    @Test
    public void shouldUseEquals() {
        Product first = new Product(1, "Java I", 100500);
        Product second = new Product(1, "Java I", 1000100);
        assertEquals(first, second);
    }
}