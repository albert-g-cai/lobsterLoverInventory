package com.lobsterWeb.util;
//import com.sun.javaws.security.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class GetSqlSession {
    public static SqlSession createSqlSession() throws IOException {
        SqlSessionFactory sqlSessionFactory =null;
        InputStream input =null;
        SqlSession session=null;

        try{
            String resource="mybatis-config.xml";
            input= Resources.getResourceAsStream(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(input);
            session=sqlSessionFactory.openSession();
            System.out.println("sesson: "+session.toString());
            return session;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(createSqlSession());
    }
}
