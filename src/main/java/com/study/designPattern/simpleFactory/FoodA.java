package com.study.designPattern.simpleFactory;

/**
 * @Author: xiar
 * @CreateTime: 2025-05-11
 * @Description: 食物A
 */
public class FoodA implements Food{
    @Override
    public void eat() {
        System.out.println("FoodA is good");
    }
}
