package com.ipssas.factory;

import java.lang.reflect.Constructor;

public class PersonCreator {
    private PersonCreator() {

    }

    public static IPerson createPerson(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getConstructor();
        return (IPerson) constructor.newInstance();
    }
}
