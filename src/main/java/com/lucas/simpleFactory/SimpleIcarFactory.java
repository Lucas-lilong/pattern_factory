package com.lucas.simpleFactory;

import com.lucas.Icar;

/**
 * 2019/3/11
 * 创建人：lilonglong
 */
public class SimpleIcarFactory {
    public Icar createIcar(Class clazz){
        if (null!=clazz){
            try {
                Icar instance =(Icar) clazz.newInstance();
                return instance;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
