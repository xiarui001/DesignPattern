package com.study.designPattern.singleton;

/**
 * 懒汉单例模式
 */
public class LazySingleton {

    private LazySingleton(){}

    private static volatile LazySingleton instance = null;

    public synchronized static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
