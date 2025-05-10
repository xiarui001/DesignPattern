package com.study.designPattern.singleton;

/**
 * iodh模式的单例 减少了锁的消耗
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
