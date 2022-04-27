package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void ifAmountFromRange() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 600;
        int actual = cashbackHackService.remain(amount);
        int expected = 400;
        assertEquals(actual,expected);
    }

    @Test
    public void ifAmountEqualsOneThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void ifAmountEqualsOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }

    @Test
    public  void ifAmountEqualsZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void ifAmountIsNegative() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -10;
        int actual = cashbackHackService.remain(amount);
        int expected = 1010;
        assertEquals(actual,expected);
    }
}