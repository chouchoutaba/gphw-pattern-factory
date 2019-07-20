package com.gphw.pattern.factoryMethod;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:53
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICarFactory factory = new TruckFactory();
        Car car = factory.buildCar();
        car.run();
        factory=new RacingCarFactory();
        car=factory.buildCar();
        car.run();
    }
}
