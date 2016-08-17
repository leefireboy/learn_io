/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.file.bxd;

import java.io.File;

/**
 * <P>
 * Description:文件深度遍历
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月4日下午2:49:17
 */
public class FileErgodicDemo {

    public static void main(String[] args) {
        File dir = new File("E:\\demo");
        listAll(dir);
    }

    /**
     * <P>
     * Description:文件深度遍历
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月14日  上午10:57:11
     * @param dir
     */
    public static void listAll(File dir) {
        System.out.println("dir:" + dir.getAbsolutePath());
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                listAll(files[i]);
            } else {
                System.out.println("file:" + files[i].getAbsolutePath());
            }
        }
    }

}
