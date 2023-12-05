package ru.netology.java6hw.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        System.out.println("номер месяца, в котором был минимум продаж:" + service.minSales(sales));

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenEnds2() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        System.out.println("номер месяца, в котором был максимум продаж:" + service.maxSales(sales));

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenEnds3() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 180;
        int actualMonth = service.calcSumOfSales(sales);

        System.out.println("сумму всех продаж:" + service.calcSumOfSales(sales));

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenEnds4() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 15;
        double actualMonth = service.calcAverageSalesAmount(sales);

        System.out.println("средняя сумма продаж в месяц:" + service.calcAverageSalesAmount(sales));

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenEnds5() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        double actualMonth = service.calcBelowAverage(sales);

        System.out.println("количество месяцев, в которых продажи были ниже среднего:" + service.calcBelowAverage(sales));

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenEnds6() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        double actualMonth = service.calcAboveAverage(sales);

        System.out.println("количество месяцев, в которых продажи были выше среднего:" + service.calcAboveAverage(sales));

        Assertions.assertEquals(expectedMonth, actualMonth);

    }
}