package com.book.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.sql.Connection;

public class MybatisUtil {
    private static SqlSessionFactory factory;
    static {
        try {
            factory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession()
    {
      return  factory.openSession(true);
    }
}
