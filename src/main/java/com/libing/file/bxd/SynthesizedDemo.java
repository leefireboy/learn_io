/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.file.bxd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <P>
 * Description:综合练习：进行深度遍历，进行过滤，把符合条件的内容存储到容器中，
 *  对容器内容进行遍历，并将绝对路径写入到指定文件中
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月14日上午11:06:10
 */
public class SynthesizedDemo {

    public static void main(String[] args) {
        File dir = new File("G:\\腾讯游戏");
        FilenameFilter filter = new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }

        };
        List<File> list = new ArrayList<File>();
        getFiles(dir, filter, list);

        File destFile = new File(dir, "hello.txt");
        write2File(list, destFile);
    }

    /**
     * <P>
     * Description:遍历目录获得 List<File>
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月14日  下午3:48:22
     * @param dir
     * @param filter
     * @param list
     */
    public static void getFiles(File dir, FilenameFilter filter, List<File> list) {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                getFiles(file, filter, list);
            } else {
                if (filter.accept(dir, file.getName())) {
                    list.add(file);
                }
            }
        }
    }

    /**
     * <P>
     * Description:把文件名写入指定文本中
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月14日  下午3:41:49
     * @param list
     * @param destFile
     */
    public static void write2File(List<File> list, File destFile) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(destFile));
            for (File file : list) {
                bw.write(file.getAbsolutePath());
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("写入失败");
        } finally {
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }

}
