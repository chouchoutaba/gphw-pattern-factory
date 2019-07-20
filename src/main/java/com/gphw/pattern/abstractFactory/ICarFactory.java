package com.gphw.pattern.abstractFactory;

import com.gphw.pattern.factoryMethod.Car;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:51
 */
public interface ICarFactory {
    IWheel buildWheel();
    IEngine buildEngine();
}
