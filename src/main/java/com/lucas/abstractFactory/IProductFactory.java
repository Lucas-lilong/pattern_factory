package com.lucas.abstractFactory;

import com.lucas.Icar;
import com.lucas.factoryMethod.IcarFactory;

/**
 * 2019/3/13
 * 创建人：lilonglong
 */
public interface IProductFactory {
    /**
     * @return
     */
    public Icar createCar();

    public IcarPart createIcarPart();
}
