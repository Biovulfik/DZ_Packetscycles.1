package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.MonthCounterService;

public class MonthCounterServiceTest {
    @Test
    public void calculationOfTheNumberOfMonthsOfRest1() {
        MonthCounterService service = new MonthCounterService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calculationOfTheNumberOfMonthsOfRest2() {
        MonthCounterService service = new MonthCounterService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}
