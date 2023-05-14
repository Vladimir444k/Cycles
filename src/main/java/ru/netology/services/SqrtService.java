package ru.netology.services;

public class SqrtService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) {
                if (money >= threshold) {
                    if (money >= income) {
                        count++;
                        money = income - expenses - expenses * 2;
                    } else {
                        money = income - expenses;
                    }
                } else {
                    money = money + income - expenses;
                }
            } else {
                money = money + income;
            }
        }
        return count;
    }
}
