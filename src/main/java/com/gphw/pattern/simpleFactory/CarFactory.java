package com.gphw.pattern.simpleFactory;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 14:42
 */
public class CarFactory {
    public static Car buildCar(Class carClazz){
        Car car=null;
        try {
            car= (Car)carClazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return car;
    }
}
