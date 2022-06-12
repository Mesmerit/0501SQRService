package ru.netology.sqr;

public class SQRService {
    int quantity;
    int minNumber = 10;
    int maxNumber = 99;

    public int calculate(int minLimit, int maxLimit) {
        for (int i = minNumber; i < maxNumber + 1; i++) {
            int sqr = i * i;
            if (sqr >= minLimit) {
                if (sqr <= maxLimit) {
                    quantity = quantity + 1;
                }
            }
        }
        return quantity;
    }
}
