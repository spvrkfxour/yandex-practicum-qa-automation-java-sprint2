package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;


public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice += food.getPrice() * food.getAmount();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
                totalPrice += ((food.getPrice() * (1 - ((food.getDiscount() / 100))) * food.getAmount()));
            }
        return totalPrice;
    }

    public double getTotalPriceVegetarianFood() {
        double totalPrice = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                totalPrice += food.getPrice() * food.getAmount();
            }
        }
        return totalPrice;
    }
}
