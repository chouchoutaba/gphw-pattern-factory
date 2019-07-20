package com.gphw.pattern.abstractFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 15:01
 */
public class TruckWheel implements IWheel{
    @Override
    public void conflict() {
        System.out.println("卡车轮胎摩擦力大");
    }
}
