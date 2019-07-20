package com.gphw.pattern.abstractFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 15:29
 */
public class RacingCarFactory implements ICarFactory{
    @Override
    public IWheel buildWheel() {
        return new RacingCarWheel();
    }

    @Override
    public IEngine buildEngine() {
        return new RacingCarEngine();
    }
}
