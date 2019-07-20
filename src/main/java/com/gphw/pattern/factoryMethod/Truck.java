package com.gphw.pattern.factoryMethod;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:46
 */
public class Truck implements Car {
    @Override
    public void run() {
        System.out.println("卡车跑得慢");
    }
}
