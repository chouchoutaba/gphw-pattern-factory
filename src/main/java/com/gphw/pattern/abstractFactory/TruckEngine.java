package com.gphw.pattern.abstractFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 15:26
 */
public class TruckEngine implements IEngine{
    @Override
    public void roll() {
        System.out.println("卡车发动机转速慢");
    }
}
