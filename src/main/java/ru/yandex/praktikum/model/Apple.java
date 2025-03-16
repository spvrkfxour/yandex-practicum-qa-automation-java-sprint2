package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Discount.APPLE_RED_DISCOUNT;
import static ru.yandex.praktikum.model.constants.Colour.COLOUR_RED;
import static ru.yandex.praktikum.model.constants.Discount.DEFAULT_DISCOUNT;


public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(COLOUR_RED) ? APPLE_RED_DISCOUNT : DEFAULT_DISCOUNT;
    }
}
