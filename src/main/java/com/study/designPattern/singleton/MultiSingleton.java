package com.study.designPattern.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 指定数量个单例
 */
public class MultiSingleton {

    private static List<MultiSingleton> multiSingleton = new ArrayList<>(10);

    private static volatile  boolean needInit = true;

    private static MultiSingleton getInstance(){
        if(needInit){
            synchronized (MultiSingleton.class){
                if(needInit){

                    for (int i = 0; i < 10; i++) {
                        multiSingleton.add(new MultiSingleton());
                    }

                    needInit = false;
                }
            }
        }
        System.out.println("实例数量" + multiSingleton.size() + getHash());
        return multiSingleton.get(0);
    }

    private static String getHash() {
        String hash = "";
        for (MultiSingleton singleton : multiSingleton) {
            hash = hash + singleton.hashCode();
        }
        return hash;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> getInstance()).start();
            System.out.println("实例数量" + multiSingleton.size());
        }


    }



}
