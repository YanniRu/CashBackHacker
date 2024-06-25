package ru.netology.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void shouldRemindSpend100() {

        CashBackHacker cbh = new CashBackHacker();

        int amount = 900;

        int actual = cbh.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemindSpend500() {

        CashBackHacker cbh = new CashBackHacker();

        int amount = 500;

        int actual = cbh.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void notShouldRemindSpend100() {

        CashBackHacker cbh = new CashBackHacker();

        int amount = 1000;

        int actual = cbh.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void notShouldRemindSpend100again() {

        CashBackHacker cbh = new CashBackHacker();

        int amount = 1100;

        int actual = cbh.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
