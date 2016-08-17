/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <P>
 * Description:获取键盘输入，转换为大写显示，如果输入 over 结束键盘输入
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月1日下午4:33:01
 */
public class TransStreamDemo2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String lineStr = null;
        while ((lineStr = br.readLine()) != null) {
            if ("over".equals(lineStr)) {
                break;
            }
            bw.write(lineStr.toUpperCase());
            bw.newLine();
            bw.flush();
        }
    }

}

