package com.gphw.pattern.abstractFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 15:27
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICarFactory factory = new RacingCarFactory();
        factory.buildEngine().roll();
        factory.buildWheel().conflict();
        factory=new TruckFactory();
        factory.buildWheel().conflict();
        factory.buildEngine().roll();
    }
}
