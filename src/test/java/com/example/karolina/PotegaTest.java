package com.example.karolina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PotegaTest {

    @Test
    public void potega() {
        Potega.pot  pot= new Potega.pot();
            int a=28;
            int n=19;
            int potega = (int) Math.pow(a, n);
            System.out.println(a + " podniesione do potęgi " + n + " wynosi:" + potega);

            System.out.println();


    }
}