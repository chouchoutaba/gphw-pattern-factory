package com.gphw.pattern.simpleFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:48
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car car = CarFactory.buildCar(RacingCar.class);
        car.run();
    }
}
