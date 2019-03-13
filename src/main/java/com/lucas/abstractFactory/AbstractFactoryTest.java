package com.lucas.abstractFactory;

import com.lucas.Icar;
import com.lucas.factoryMethod.IcarFactory;

/**
 * 2019/3/11
 * 创建人：lilonglong
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IProductFactory IProductFactory = new JeepCarFactory();
        Icar icar = IProductFactory.createCar();
        icar.run();
    }
}
