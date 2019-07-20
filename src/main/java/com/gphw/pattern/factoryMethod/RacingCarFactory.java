package com.gphw.pattern.factoryMethod;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:53
 */
public class RacingCarFactory implements ICarFactory{
    @Override
    public Car buildCar() {
        return new RacingCar();
    }
}
