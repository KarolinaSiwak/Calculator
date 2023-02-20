package com.example.karolina;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
    class YyyTest {


        @Test
        public void sum() {
            Calculator.Dodawanie dodawanie = new Calculator.Dodawanie();
            int arg1 = 100;
            int arg2 = 70;
            int result = arg1 + arg2;
            System.out.println("Wynik dodawania: " + arg1 + " + " + arg2 + ", wynosi:" + result);

            assertEquals(170, result);

        }
    }