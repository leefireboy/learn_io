/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <P>
 * Description:实现控制台输入阻塞，控制台输入后紧接着控制台输出
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月19日上午10:21:19
 */
public class TestTransForm2 {

    private static String s = null;

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            s = br.readLine();
            while (s != null) {
                if (s.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(s.toUpperCase());
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

