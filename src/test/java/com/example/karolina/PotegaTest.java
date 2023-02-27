package com.example.karolina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PotegaTest {

    @Test
    public void potega() {

            int a=28;
            int n=19;
            int wynik = (int) Math.pow(a, n);
            assertEquals(2147483647, wynik);
            System.out.println(a + " podniesione do potęgi " + n + " wynosi:" + wynik);

            System.out.println();


    }
}