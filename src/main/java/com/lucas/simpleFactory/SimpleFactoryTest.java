package com.lucas.simpleFactory;

import com.lucas.Icar;
import com.lucas.JeepCar;
import com.lucas.simpleFactory.SimpleIcarFactory;

/**
 * Hello world!
 *
 */
public class SimpleFactoryTest
{
    public static void main( String[] args )
    {
        SimpleIcarFactory simpleIcarFactory = new SimpleIcarFactory();
        Icar icar = simpleIcarFactory.createIcar(JeepCar.class);
        icar.run();
    }
}
