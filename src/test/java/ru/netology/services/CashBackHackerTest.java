package ru.netology.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackerTest {

    @org.junit.Test
    public void shouldRemindSpend100 () {

        CashBackHacker cbh = new CashBackHacker();

        int amount = 900;

        int actual = cbh.remain(amount);
        int expected = 100;

        assertEquals(actual, expected );
    }

    @org.junit.Test
    public void notShouldRemindSpend100 () {

        CashBackHacker cbh = new CashBackHacker();

        int amount = 1000;

        int actual = cbh.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected );
    }
}
