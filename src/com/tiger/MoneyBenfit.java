package com.tiger;

public class MoneyBenfit {

    enum MoneyDate {
        MWeek,
        MMONTH,
        MQUARTER,
        MYEAR;
    }

    public static final double CCB_YEAR_RATE = 0.0435;
    public static final double CCB_DAY_RATE = CCB_YEAR_RATE / 365;
    public static final double BASE_MONEY = 20000d;

    public static void main(String[] args) {

        System.out.println("Rent Money: " + BASE_MONEY);
        System.out.println("Year Rent Rate: " + CCB_YEAR_RATE);

        getMoney(MoneyDate.MWeek, BASE_MONEY, CCB_DAY_RATE);
        getMoney(MoneyDate.MMONTH, BASE_MONEY, CCB_DAY_RATE);
        getMoney(MoneyDate.MQUARTER, BASE_MONEY, CCB_DAY_RATE);
        getMoney(MoneyDate.MYEAR, BASE_MONEY, CCB_DAY_RATE);

        getMonthMoney(BASE_MONEY, CCB_DAY_RATE, false);
        getMonthMoney(BASE_MONEY, CCB_DAY_RATE, true);
    }


    public static double getMoney(MoneyDate moneyDate, double baseMoney, double rate) {
        double extraMoneyDate = 0.0, originalMoney = baseMoney;
        double fullYearExtraMoney = baseMoney;
        switch (moneyDate) {
            case MWeek:
                System.out.println("MWeek:");
                baseMoney = baseMoney * Math.pow(1 + rate, 7);
                extraMoneyDate = baseMoney - originalMoney;
                fullYearExtraMoney = extraMoneyDate * 52;
                break;
            case MMONTH:
                System.out.println("MMONTH:");
                baseMoney = baseMoney * Math.pow(1 + rate, 30);
                extraMoneyDate = baseMoney - originalMoney;
                fullYearExtraMoney = extraMoneyDate * 12;
                break;
            case MQUARTER:
                System.out.println("MQUARTER:");
                baseMoney = baseMoney * Math.pow(1 + rate, 30 * 3);
                extraMoneyDate = baseMoney - originalMoney;
                fullYearExtraMoney = extraMoneyDate * 4;
                break;
            case MYEAR:
                System.out.println("MYEAR:");
                baseMoney = baseMoney * Math.pow(1 + rate, 365);
                extraMoneyDate = baseMoney - originalMoney;
                fullYearExtraMoney = extraMoneyDate * 1;
                break;

            default:
                break;
        }

        System.out.printf("%.1f; %.1f; %.1f, %.1f%n", originalMoney, baseMoney, extraMoneyDate, fullYearExtraMoney);

        return extraMoneyDate;
    }

    public static void getMonthMoney(double baseMoney, double rate, boolean flag) {
        System.out.println("getMonthMoney()");
        double monthMoney = baseMoney, originalMoney = 0;
        double extraMoneyMonth = 0, sumExtramMoney = 0;

        int month = 0;
        while (baseMoney > 0.0 && month < 12) {
            originalMoney = baseMoney;
            baseMoney = baseMoney * Math.pow(1 + rate, 30);
            extraMoneyMonth = baseMoney - originalMoney;
            month++;

            System.out.printf("month=%d; %.1f; %.1f; %.1f %n", month, originalMoney, baseMoney, extraMoneyMonth);

            if (!flag) {
                baseMoney += monthMoney;
            } else {
                baseMoney = monthMoney * (month + 1);
            }
            sumExtramMoney += extraMoneyMonth;
        }

        System.out.printf("sumExtramMoney= %.1f%n", sumExtramMoney);

    }
}
