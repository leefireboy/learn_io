/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.sequence.bxd;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

/**
 * <P>
 * Description:合并切割文件
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月16日下午11:33:20
 */
public class MergeFileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("F:\\partfiles");
        mergeFile(file);
    }

    /**
     * <P>
     * Description:合并切割文件   不完善版本
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月17日  上午12:23:48
     * @param dir
     * @throws IOException
     */
    public static void mergeFile(File dir) throws IOException {
        File[] files = dir.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".part");
            }

        });

        if (files.length < 1) {
            throw new RuntimeException("您要的文件不存在");
        }

        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for (File file : files) {
            al.add(new FileInputStream(file));
        }

        Enumeration<FileInputStream> en = Collections.enumeration(al);

        SequenceInputStream sit = new SequenceInputStream(en);
        BufferedInputStream bis = new BufferedInputStream(sit);

        File destDir = new File("F:\\mergefile");
        if (!destDir.exists()) {
            destDir.mkdirs();
        }

        FileInputStream fis = new FileInputStream(dir.getAbsolutePath() + File.separator + SplitFileDemo.PROPERTIES);

        Properties properties = new Properties();
        properties.load(fis);

        fis.close();

        FileOutputStream fos = new FileOutputStream(new File(destDir, properties.getProperty(SplitFileDemo.FILENAME)));
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
            bos.flush();
        }

        bos.close();
        bis.close();
    }

}

