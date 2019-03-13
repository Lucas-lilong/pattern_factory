package com.lucas.factoryMethod;

import com.lucas.Icar;
import com.lucas.JeepCar;

/**
 * 2019/3/11
 * 创建人：lilonglong
 */
public class JeepCarFactory implements IcarFactory{
    @Override
    public Icar create() {
        return new JeepCar();
    }
}
