/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd2;

import java.io.Serializable;

/**
 * <P>
 * Description:IO 对象流测试类
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月21日下午3:50:33
 */
public class Person implements Serializable {

    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = -758553087751258240L;
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

