package com.gphw.pattern.factoryMethod;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:51
 */
public class TruckFactory implements ICarFactory{
    @Override
    public Car buildCar() {
        return new Truck();
    }
}
