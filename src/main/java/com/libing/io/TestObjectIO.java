/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月23日下午10:26:05
 */
public class TestObjectIO {

    public static void main(String[] args) throws Exception {
        T t = new T();
        t.k = 1;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\unicode.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\unicode.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        T tRead = (T) ois.readObject();
        System.out.println(tRead.i + " " + tRead.j + " " + tRead.d + " " + tRead.k);
        ois.close();
    }
}

class T implements Serializable {
    private static final long serialVersionUID = -8220035478662711763L;
    int i = 10;
    int j = 8;
    double d = 2.8;
    int k  = 6;
}

