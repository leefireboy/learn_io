/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月22日上午10:05:58
 */
public class TestDataStream {

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

