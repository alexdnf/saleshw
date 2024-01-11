package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void sumSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatService service = new StatService();

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatService service = new StatService();

        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatService service = new StatService();

        long expected = 15;
        long actual = service.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatService service = new StatService();

        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThenAvgSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatService service = new StatService();

        int expected = 5;
        int actual = service.lessThenAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThenAvgSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatService service = new StatService();

        int expected = 5;
        int actual = service.moreThenAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}
