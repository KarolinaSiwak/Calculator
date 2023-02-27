package com.example.karolina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorNTest {

    @Test
    public void suma() {
        CalculatorN.Nty nty = new CalculatorN.Nty();
        for(int i=1; i<100; i++){
            int sum = nty.suma(i, i++);
            System.out.println(sum);

        }


    }
}