/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.file.bxd;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <P>
 * Description:File 对象的常见方法
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月2日下午4:03:23
 */
@SuppressWarnings("unused")
public class FileMethodDemo {

    public static void main(String[] args) throws IOException {
        // getDemo();
        // createAndDeleteDemo();
        isExist();
    }

    private static void isExist() throws IOException {
        File file = new File("demo1.txt");
        boolean b = file.exists();
        System.out.println(b);
    }

    private static void createAndDeleteDemo() throws IOException {
        // 如果文件不存在则创建，如果存在则不创建
        File file = new File("demo.txt");
        boolean b = file.createNewFile();
        System.out.println("b=" + b);

        File dir = new File("abc");
        dir.mkdir();
    }

    public static void getDemo() {
        File file = new File("demo.txt");
        // 获得文件名
        String fileName = file.getName();
        // 获得文件绝对路径
        String fileAbsPath = file.getAbsolutePath();
        // 获得相对路径
        String filePath = file.getPath();
        // 获得文件大小
        long fileSize = file.length();
        // 获得文件最后修改时间
        long fileTime = file.lastModified();
        Date date = new Date(fileTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str_fileTime = sdf.format(date);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String str_fileTime2 = dateFormat.format(date);
        System.out.println("fileName:" + fileName);
        System.out.println("fileAbsPath:" + fileAbsPath);
        System.out.println("filePath:" + filePath);
        System.out.println("fileSize:" + fileSize);
        System.out.println("fileTime:" + fileTime);
        System.out.println("str_fileTime:" + str_fileTime);
        System.out.println("str_fileTime2:" + str_fileTime2);
    }

}
