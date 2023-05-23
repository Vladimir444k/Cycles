package ru.netology.services;

public class SqrtService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                //отдыхаем
                money -= expenses;
                money /= 3;
                count++;
            } else {
                //работаем
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}
