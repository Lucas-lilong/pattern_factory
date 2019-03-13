package com.lucas.abstractFactory;

import com.lucas.Icar;
import com.lucas.JeepCar;
import com.lucas.factoryMethod.IcarFactory;

/**
 * 2019/3/11
 * 创建人：lilonglong
 */
public class JeepCarFactory implements IProductFactory{
    @Override
    public Icar createCar() {
        return new JeepCar();
    }

    @Override
    public IcarPart createIcarPart() {
        return null;
    }
}
