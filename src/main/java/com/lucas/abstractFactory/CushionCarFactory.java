package com.lucas.abstractFactory;

import com.lucas.Icar;
import com.lucas.JeepCar;

/**
 * 2019/3/11
 * 创建人：lilonglong
 */
public class CushionCarFactory implements IProductFactory{
    @Override
    public Icar createCar() {
        return null;
    }

    @Override
    public IcarPart createIcarPart() {
        return new CushionCar();
    }
}
