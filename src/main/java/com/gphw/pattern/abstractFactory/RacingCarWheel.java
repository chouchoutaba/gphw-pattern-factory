package com.gphw.pattern.abstractFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 15:25
 */
public class RacingCarWheel implements IWheel{
    @Override
    public void conflict() {
        System.out.println("赛车轮胎摩擦力小");
    }
}
