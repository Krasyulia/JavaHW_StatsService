package ru.netology.stats;

public class StatsService {

    //Сумма продаж
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public long calculateAverageSum(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    //Номер месяца с пиком продаж
    public int showMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month =0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца с минимумом продаж
    public int showMinSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Количество месяцев с продажами выше среднего
    public int countMaxMonths(long[] sales) {
        long averageSum = calculateAverageSum(sales);
        int maxMonths = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                maxMonths++;
            }
        }
        return maxMonths;
    }

    //Количество месяцев с продажами ниже среднего
    public int countMinMonths(long[] sales) {
        long averageSum = calculateAverageSum(sales);
        int minMonths = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                minMonths++;
            }
        }
        return minMonths;
    }
}
