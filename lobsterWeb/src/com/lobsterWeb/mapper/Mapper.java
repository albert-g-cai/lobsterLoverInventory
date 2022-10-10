package com.lobsterWeb.mapper;

import com.lobsterWeb.entity.User;

public interface Mapper {
    public User queryLobsterClientByName(String userName);
}
