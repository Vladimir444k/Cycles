package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtServiceTest {

    @Test
    void calculate() {
        SqrtService service = new SqrtService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}