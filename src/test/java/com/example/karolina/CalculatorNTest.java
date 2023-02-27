package com.example.karolina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorNTest {

    @Test
    public void suma() {
        CalculatorN.Nty nty = new CalculatorN.Nty();
        int suma = 0;
        for (int i = 1; i < 100; i++) {
            suma = nty.suma(suma, i);
            System.out.println(suma);
        }
        assertEquals(suma, 4950);
    }
}