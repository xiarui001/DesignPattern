package com.study.designPattern.singleton;

/**
 * iodh模式的单例  相比懒汉 减少了锁的消耗
 * 相比饿汉 不需要在类加载时就创建单例对象
 */
public class IodhSingleton {

    private IodhSingleton(){}

    private static class HolderClass{
        private  final static IodhSingleton instance = new IodhSingleton();
    }

    private static IodhSingleton getInstance(){
        return HolderClass.instance;
    }


}
