package ru.netology.services;

public class SqrtService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                if (money >= income) {
                    count++;
                    money = income - expenses;
                } else {
                    money = income - expenses * 4;
                }
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
