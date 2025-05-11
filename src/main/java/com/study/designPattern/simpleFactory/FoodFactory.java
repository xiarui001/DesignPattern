package com.study.designPattern.simpleFactory;

/**
 * 食物简单工厂类
 */
public class FoodFactory {

    public static Food getFood(String food) {
        if ("A".equals(food)) {
            return new FoodA();
        } else if ("B".equals(food)) {
            return new FoodB();
        }

        return null;

    }

    public static void main(String[] args) {
        FoodFactory.getFood("A").eat();
    }
}
