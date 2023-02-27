package com.example.karolina;


public class CalculatorN {


    public static class Nty {
        public int suma(int base, int exponent) {
            int result = 1;


            for (int i = 1; i < exponent; ++i) {
                result *= base;

            }
            return result;
        }
    }
}
