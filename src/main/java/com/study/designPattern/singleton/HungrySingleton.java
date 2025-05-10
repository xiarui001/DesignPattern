package com.study.designPattern.singleton;

/**
 * 饿汗单例模式
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return HungrySingleton.instance;
    }

}
