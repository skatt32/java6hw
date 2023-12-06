package ru.netology.java6hw.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    public int calcSumOfSales(long[] sales) { //сумма продаж за год
        int sumOfSales = 0;
        for (long month : sales) {
            sumOfSales += month;
        }
        return sumOfSales;
    }

    public double calcAverageSalesAmount(long[] sales) { //средняя сумма продаж в месяц
        return calcSumOfSales(sales) / sales.length;
    }


    public int calcBelowAverage(long[] sales) { //количество месяцев, в которых продажи были ниже среднего

        int count = 0;
        double AverageSalesAmount = calcAverageSalesAmount(sales);
        for (long month : sales) {
            if (month < AverageSalesAmount) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcAboveAverage(long[] sales) { //количество месяцев, в которых продажи были выше среднего

        int count = 0;
        double AverageSalesAmount = calcAverageSalesAmount(sales);
        for (long month : sales) {
            if (month > AverageSalesAmount) {
                count = count + 1;
            }
        }
        return count;
    }
}





