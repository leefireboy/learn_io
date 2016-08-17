/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.FileReader;
import java.io.IOException;

/**
 * <P>
 * Description:模拟一个BufferedReader
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月26日下午2:44:27
 */
public class MyBufferedReader {

    private final FileReader fr;

    // 定义一个数组作为缓冲区
    private final char[] buf = new char[1024];

    // 定义一个指针用于操作这个数组中的元素。当操作到最后一个元素后，指针应该归零。
    private int pos = 0;

    // 定义一个计数器用于记录缓冲区中的数据个数。当该数据减到0，就从源中继续获取数据到缓冲区中。
    private int count = 0;

    public MyBufferedReader(FileReader fr) {
        this.fr = fr;
    }

    public int myRead() throws IOException {
        if (count == 0) {
            count = fr.read(buf);
            pos = 0;
        }
        if (count < 0) {
            return -1;
        }
        char ch = buf[pos++];
        count--;
        return ch;
    }

    public String myReadLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while ((ch = myRead()) != -1) {
            if ('\r' == ch) {
                continue;
            }
            if ('\n' == ch) {
                return sb.toString();
            }
            sb.append((char)ch);
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        return null;
    }

    public void myClose() throws IOException {
        fr.close();
    }

}

