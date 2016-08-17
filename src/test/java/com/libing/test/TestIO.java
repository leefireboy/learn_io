/*
 * Copyright (c) 2016 libing. All rights reserved.
 */
package com.libing.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <P>
 * Description:
 * </p>
 * @author libing
 * @version 1.0
 * @Date 2016年6月22日上午9:54:17
 */
public class TestIO {

    public static void main(String[] args) throws IOException {
        List<String> createSqlList = new ArrayList<String>();
        File sqlFile = new File("123.SQL");
        InputStream is = new FileInputStream(sqlFile);
        InputStreamReader fr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer str = new StringBuffer();
        String sql = null;
        while ((sql = br.readLine()) != null) {
            sql = sql.trim();
            if (sql.endsWith(";")) {
                sql = sql.substring(0, sql.length() - 1);
                str.append(sql);
                // str = valid sql
                createSqlList.add(str.toString());
                str = new StringBuffer();
            } else {
                str.append(sql);
            }
        }
        for (String sql1 : createSqlList) {
            System.out.println(sql1);
        }
        br.close();
    }

}
