package com.gphw.pattern.abstractFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 15:26
 */
public class RacingCarEngine implements IEngine{
    @Override
    public void roll() {
        System.out.println("赛车发动机转速快");
    }
}
