package com.gphw.pattern.simpleFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:47
 */
public class RacingCar implements Car{

    @Override
    public void run() {
        System.out.println("赛车跑得快");
    }
}
