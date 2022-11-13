package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testJunitRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 700;
        int actual = service.remain(300);
        assertEquals(expected, actual);
    }

    @Test
    public void testJunitRemainMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 800;
        int actual = service.remain(1200);
        assertEquals(expected, actual);
    }

    @Test
    public void testJunitRemainNull() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

}