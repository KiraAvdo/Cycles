package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
        //1
    }

    public long average(long[] sales) {
        long sumSales = sum(sales);
        return sum(sales) / sales.length;
        //2
    }

    public int maxSales(long[] sales) {
        int month = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                month = i;
            }
        }
        return month;
        //3
    }

    public int minSales(long[] sales) {
        int month = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                month = i;
            }
        }
        return month;
        //4
    }

    public int lowAverage(long[] sales) {
        long averageSales = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
        //5
    }

    public int highAverage(long[] sales) {
        long averageSales = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
        //6

    }
}
