/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <P>
 * Description:对象流的使用练习
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月21日下午3:44:44
 */
public class ObjectStreamDemo {

    public static void main(String[] args) throws IOException {
        writeObject();
        readObject();
    }

    /**
     * <P>
     * Description:对象持久化
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月21日  下午4:19:48
     * @throws IOException
     */
    public static void writeObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));

        Person obj = new Person("ICE", 24);
        // 被持久化的对象必须实现 Serializable 序列化标记接口
        oos.writeObject(obj);

        oos.close();
    }

    /**
     * <P>
     * Description:持久化对象文件的读取
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月21日  下午4:19:59
     * @throws IOException
     */
    public static void readObject() throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));

        Person obj = null;

        try {
            obj = (Person) ois.readObject();
            System.out.println(obj.getName() + ":" + obj.getAge());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("文件未找到");
        } finally {
            ois.close();
        }
    }

}

