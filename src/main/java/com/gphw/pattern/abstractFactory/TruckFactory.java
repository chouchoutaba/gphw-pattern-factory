package com.gphw.pattern.abstractFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 15:30
 */
public class TruckFactory implements ICarFactory{
    @Override
    public IWheel buildWheel() {
        return new TruckWheel();
    }

    @Override
    public IEngine buildEngine() {
        return new TruckEngine();
    }
}
