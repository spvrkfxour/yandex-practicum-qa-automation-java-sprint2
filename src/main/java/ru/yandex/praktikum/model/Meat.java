package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Discount.DEFAULT_DISCOUNT;


public class Meat extends Food {

    public Meat(int amount, double price) {
        super(amount, price, false);
    }

    @Override
    public double getDiscount() {
        return DEFAULT_DISCOUNT;
    }
}
