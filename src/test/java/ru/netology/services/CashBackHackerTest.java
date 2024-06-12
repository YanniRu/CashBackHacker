package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackerTest {

    @Test
    void shouldRemindSpend100 () {

        CashBackHacker cbh = new CashBackHacker();

        int amount = 900;

        int actual = cbh.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}
