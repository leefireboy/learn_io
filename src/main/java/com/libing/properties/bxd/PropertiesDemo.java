/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.properties.bxd;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * <P>
 * Description:Properties 的使用练习
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月4日下午5:49:10
 */
public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
//        propertiesDemo();
//        propertiesListDemo();
//        propertiesStoreDemo();
//        propertiesLoadDemo();
        propertiesModifyDemo();
    }

    /**
     * <P>
     * Description:从文档中读取 Properties 数据，修改后再次存入
     * </p>
     * @author "libing"
     * @version 1.0
     * @throws IOException
     * @Date 2016年3月9日  下午11:33:58
     */
    public static void propertiesModifyDemo() throws IOException {
        File file = new File("demo.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileReader fr = new FileReader(file);

        Properties properties = new Properties();
        properties.load(fr);
        properties.setProperty("name", "Ice");

        FileWriter fw = new FileWriter(file);
        properties.store(fw, "");

        fw.close();
        fr.close();
    }

    /**
     * <P>
     * Description:从文本文件中读取 Properties 数据
     * </p>
     * @author "libing"
     * @version 1.0
     * @throws IOException
     * @throws IOException
     * @Date 2016年3月9日  下午10:59:40
     */
    public static void propertiesLoadDemo() throws IOException {
        Properties properties = new Properties();
        FileReader fr = new FileReader("demo.txt");
        properties.load(fr);
        properties.list(System.out);
    }

    /**
     * <P>
     * Description:数据持久化
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月9日  下午10:53:42
     * @throws IOException
     */
    public static void propertiesStoreDemo() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name", "lee");
        properties.setProperty("age", "12");
        properties.setProperty("age", "24");

        FileWriter fw = new FileWriter("demo.txt");
        properties.store(fw, "name:age");
        fw.close();
    }

    /**
     * <P>
     * Description:Properties 集合遍历
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月9日  下午10:54:12
     */
    public static void propertiesListDemo() {
        Properties properties = new Properties();
        properties.setProperty("name", "lee");
        properties.setProperty("age", "12");
        properties.setProperty("age", "24");
        properties.list(System.out);
        properties = System.getProperties();
        properties.list(System.out);
    }

    /**
     * <P>
     * Description:Properties 集合基本方法
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月9日  下午10:54:54
     */
    public static void propertiesDemo() {
        Properties properties = new Properties();
        properties.setProperty("name", "lee");
        properties.setProperty("age", "12");
        properties.setProperty("age", "24");// key 相同 value 覆盖
        Set<String> names = properties.stringPropertyNames();
        for (String name : names) {
            System.out.println(name + ":" + properties.getProperty(name));
        }
    }

}

