package com.lucas.factoryMethod;

import com.lucas.Icar;

/**
 * 2019/3/11
 * 创建人：lilonglong
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IcarFactory icarFactory = new JeepCarFactory();
        Icar icar = icarFactory.create();
        icar.run();
    }
}
