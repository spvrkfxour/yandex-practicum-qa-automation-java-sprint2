package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;


public class Main {

    public static void main(String[] args) {

        Meat food1 = new Meat(5, 100);
        Apple food2 = new Apple(10, 50, Colour.COLOUR_RED);
        Apple food3 = new Apple(8, 60, Colour.COLOUR_GREEN);

        Food[] foods = {food1, food2, food3};

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.printf("Общая сумма товаров без скидки: %.2f%n", cart.getTotalPriceWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f%n", cart.getTotalPriceVegetarianFood());
    }
}
