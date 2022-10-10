/**
 * Created by Albert Cai.
 *         Date: 2022/10/9
 *         Time: 2:25
 */

package com.lobsterWeb.test;

import com.lobsterWeb.entity.ALobsterClient;
import com.lobsterWeb.entity.User;
import com.lobsterWeb.mapper.LobsterClientMapper;
import com.lobsterWeb.mapper.Mapper;
import com.lobsterWeb.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
public class Test {
    public static void main(String[] args) throws IOException {
        //obtain sqlSession object
        SqlSession sqlSession = GetSqlSession.createSqlSession();
        //obtain Lobster Client Mapper
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        LobsterClientMapper lobsterClientMapper = sqlSession.getMapper(LobsterClientMapper.class);
        System.out.println(lobsterClientMapper.toString());
        User user=mapper.queryLobsterClientByName("admin");

        ALobsterClient aLobsterClient =
                lobsterClientMapper.queryLobsterClientByName("administrator");
        //call method to get lobster client object,
        // parameter is lobsterClient: admin, return a LobsterClient entity as results.
        //ALobsterClient lobsterClient = lobsterClientMapper.queryLobsterClientByName("administrator");
        if(user!=null||aLobsterClient!=null){
            assert user != null;
            System.out.println(user.getUserName());
            assert aLobsterClient != null;
            System.out.println(aLobsterClient.getaLobsterClientName());
        }else{
            System.out.println("no such client");
        }

    }
}
