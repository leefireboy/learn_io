/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.bxd;

/**
 * <P>
 * Description:装饰设计模式
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月29日上午9:36:32
 */
public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.chiFan();
        NewPerson newPerson = new NewPerson(person);
        newPerson.chiFan();
        NewPerson2 newPerson2 = new NewPerson2();
        newPerson2.chiFan();
    }

}

class Person {

    public void chiFan() {
        System.out.println("吃饭");
    }

}

class NewPerson {

    private final Person person;

    public NewPerson(Person person) {
        this.person = person;
    }

    public void chiFan() {
        System.out.println("开胃酒");
        person.chiFan();
        System.out.println("甜点");
    }

}

class NewPerson2 extends Person {
    @Override
    public void chiFan() {
        System.out.println("开胃酒");
        super.chiFan();
        System.out.println("甜点");
    }
}