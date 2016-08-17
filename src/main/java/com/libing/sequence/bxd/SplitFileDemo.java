/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.sequence.bxd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <P>
 * Description:按指定大小切割文件
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月16日下午5:26:56
 */
public class SplitFileDemo {

    private static final int SIZE = 1048576;
    static final String FILENAME = "filename";
    static final String PROPERTIES = "file.properties";

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Documents\\Music\\Shakira - Try Everything.mp3");
        splitFile_further(file);
    }

    /**
     * <P>
     * Description:按指定大小切割文件   不完善版本
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月16日  下午11:15:51
     * @param file 目标文件
     * @throws IOException
     */
    public static void splitFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = null;

        byte[] buf = new byte[SIZE];

        File destDir = new File("F:\\partfiles");
        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        int len = 0;
        int count = 1;
        while ((len = fis.read(buf)) != -1) {
            fos = new FileOutputStream(new File(destDir, (count++) + ".part"));
            fos.write(buf, 0, len);
            fos.close();
        }

        fis.close();
    }

    public static void splitFile_further(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = null;

        byte[] buf = new byte[SIZE];

        File destDir = new File("F:\\partfiles");
        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        int len = 0;
        int count = 1;
        while ((len = fis.read(buf)) != -1) {
            fos = new FileOutputStream(new File(destDir, (count++) + ".part"));
            fos.write(buf, 0, len);
            fos.close();
        }

        fos = new FileOutputStream(new File(destDir, PROPERTIES));

        Properties properties = new Properties();
        properties.put(FILENAME, file.getName());
        properties.store(fos, "");

        fis.close();
        fos.close();
    }

}

