/**
 * Created by Albert Cai.
 *         Date: 2022/10/9
 *         Time: 2:25
 */

package com.lobsterWeb.mapper;

import com.lobsterWeb.entity.ALobsterClient;

/**
 * Lobster Interface Class
 */
public interface LobsterClientMapper {
    public ALobsterClient queryLobsterClientByName(String aLobsterClientName);
    //public LobsterClient queryLobsterClientByPwd(String lobsterClientPwd);
}
