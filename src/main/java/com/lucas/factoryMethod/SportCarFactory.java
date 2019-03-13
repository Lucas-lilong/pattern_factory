package com.lucas.factoryMethod;

import com.lucas.Icar;
import com.lucas.SportCar;

/**
 * 2019/3/11
 * 创建人：lilonglong
 */
public class SportCarFactory implements IcarFactory{
    @Override
    public Icar create() {
        return new SportCar();
    }
}
