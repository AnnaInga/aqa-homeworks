package ru.netology.service;

import org.junit.jupiter.api.Test;


class CashbackHackServiceTest {

    @Test
    void boundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 200;






    }

}