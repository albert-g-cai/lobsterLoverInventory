package com.lobsterWeb.mapper;

import com.lobsterWeb.entity.ALobsterClient;

/**
 * Lobster Interface Class
 */
public interface LobsterClientMapper {
    public ALobsterClient queryLobsterClientByName(String aLobsterClientName);
    //public LobsterClient queryLobsterClientByPwd(String lobsterClientPwd);
}
