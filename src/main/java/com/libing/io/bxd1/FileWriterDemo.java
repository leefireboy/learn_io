/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.io.bxd1;

import java.io.FileWriter;
import java.io.IOException;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年2月24日上午11:55:22
 */
public class FileWriterDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt", true);
        fw.write("haha" + LINE_SEPARATOR + "xixi");
        fw.close();
    }

}

