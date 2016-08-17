/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * <P>
 * Description:获取键盘输入，转换为大写显示，如果输入 over 结束键盘输入
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月1日下午3:43:28
 */
public class TransStreamDemo {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        while ((str = br.readLine()) != null) {
            if ("over".equals(str)) {
                break;
            }
            System.out.println(str.toUpperCase());
        }
    }

}

