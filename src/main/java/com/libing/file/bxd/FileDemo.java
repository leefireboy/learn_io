/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.file.bxd;

import java.io.File;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月2日下午3:43:13
 */
@SuppressWarnings("unused")
public class FileDemo {

    public static void main(String[] args) {
        constructDemo();

    }

    public static void constructDemo() {
        // 可以将一个存在的或者不存在的文件或者目录封装成一个 file 对象
        File file = new File("C:\\Users\\Administrator\\Desktop");

        File file1 = new File("C:\\Users\\Administrator\\Desktop\\file.txt");

        File file2 = new File("C:\\Users\\Administrator\\Desktop", "file.txt");

        File file3 = new File(file, "file.txt");

        File file4 = new File("C:" + File.separator + "Users" + File.separator + "Administrator"
                + File.separator + "Desktop" + File.separator + "file.txt");

        System.out.println(file4);
    }

}
