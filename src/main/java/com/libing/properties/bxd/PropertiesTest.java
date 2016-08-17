/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.properties.bxd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <P>
 * Description:实现使用配置文件来控制系统的个性化设置
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月12日下午4:35:58
 */
public class PropertiesTest {

    /**
     * 初始计数值，第一次运行本程序时使用
     */
    private static int COUNT = 0;

    /**
     * <P>
     * Description:主线程方法
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月14日  上午10:19:07
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        getAppCount();
    }

    /**
     * <P>
     * Description:实现使用配置文件来控制系统的个性化设置
     * </p>
     * @author "libing"
     * @version 1.0
     * @Date 2016年3月14日  上午10:03:11
     * @throws IOException
     */
    public static void getAppCount() throws IOException {
        // 将配置文件封装成 File 对象
        File configs = new File("count.properties");

        if (!configs.exists()) {
            configs.createNewFile();
        }

        FileInputStream fis = new FileInputStream(configs);

        Properties properties = new Properties();
        properties.load(fis);
        String value = properties.getProperty("time");

        if (null != value) {
            COUNT = Integer.parseInt(value);
            if (COUNT >= 5) {
                throw new RuntimeException("使用次数已到，请注册后继续使用。");
            }
        }
        COUNT++;

        // 将改变后的次数重新存储到集合中
        properties.setProperty("time", COUNT + "");

        FileOutputStream fos = new FileOutputStream(configs);

        properties.store(fos, "");

        fis.close();
        fos.close();
    }

}