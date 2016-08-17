/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.file.bxd;

import java.io.File;

/**
 * <P>
 * Description:实现删除文件夹
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月4日下午2:24:17
 */
public class RemoveDirDemo {

    public static void main(String[] args) {
        File dir = new File("E:\\迅雷下载");
        removeDir(dir);
    }

    public static void removeDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                removeDir(file);
            } else {
                System.out.println(file + ":" + file.delete());
            }
        }
        System.out.println(dir + ":" + dir.delete());
    }

}

