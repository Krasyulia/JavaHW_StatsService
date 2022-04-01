package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {54000, 49000, 85000, 36400, 500, 100500};
        long expected = 325400;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {54000, 49000, 85000, 36400, 500, 100500};
        long expected = 54233;
        long actual = service.calculateAverageSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {54000, 49000, 85000, 36400, 500, 100500};
        long expected = 6;
        long actual = service.showMaxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {54000, 49000, 85000, 36400, 500, 100500};
        long expected = 5;
        long actual = service.showMinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMaxMonths() {
        StatsService service = new StatsService();
        long[] sales = {54000, 49000, 85000, 36400, 500, 100500};
        long expected = 2;
        long actual = service.countMaxMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMinMonths() {
        StatsService service = new StatsService();
        long[] sales = {54000, 49000, 85000, 36400, 500, 100500};
        long expected = 4;
        long actual = service.countMinMonths(sales);
        assertEquals(expected, actual);
    }
}