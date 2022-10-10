package com.lobsterWeb.service;

import com.lobsterWeb.entity.ALobsterClient;
import com.lobsterWeb.entity.messageContainer.MessageModel;
import com.lobsterWeb.mapper.LobsterClientMapper;
import com.lobsterWeb.util.GetSqlSession;
import com.lobsterWeb.util.StringUtil;
import com.sun.javaws.IconUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * Business logic
 *
 */
public class LobsterClientService {
    public MessageModel lobsterClientLogin(String aLobsterClientName,
                                           String aLobsterClientPwd) throws IOException {
        MessageModel messageModel = new MessageModel();
        //Display data back to lobster client
        ALobsterClient aLobsterClient = new ALobsterClient();
        System.out.println(aLobsterClientName);
        System.out.println(aLobsterClientPwd);
        aLobsterClient.setaLobsterClientName(aLobsterClientName);
        aLobsterClient.getaLobsterClientPwd(aLobsterClientPwd);
        messageModel.setObject(aLobsterClient);
        //1. parameter empty judgement
        if (StringUtil.isEmpty(aLobsterClientName)
                || StringUtil.isEmpty(aLobsterClientPwd)){
            messageModel.setState(0);
            messageModel.setMsg("lobsterClientName and lobsterClientPwd can not be empty");
            return messageModel;
        }
        //2. call DAO layer query method, by lobster client name
        SqlSession sqlSession = GetSqlSession.createSqlSession();
        LobsterClientMapper lobsterClientMapper
                = sqlSession.getMapper(LobsterClientMapper.class);
        ALobsterClient uLobsterClientDao =
                lobsterClientMapper.queryLobsterClientByName(aLobsterClientName);
        //3. judge lobster client in db if exist
        if(uLobsterClientDao==null){
            //save state, msg, data in message model, return message model
            messageModel.setState(0);
            messageModel.setMsg("the lobster client is not exist");
            return messageModel;
        }

        //4. judge lobster client password if empty
        if (!aLobsterClientPwd.equals(uLobsterClientDao.getaLobsterClientPwd(aLobsterClientPwd))){
            messageModel.setState(0);
            messageModel.setMsg("the lobster client password is not correct");
            return messageModel;
        }
        //login success, save state, msg, data in message model, return message model
        messageModel.setObject(uLobsterClientDao);

        return messageModel;
    }
}

