package com.lobsterWeb.entity;
/*
* Lobster Client entity class (entity who taking actions)
*
* */
public class ALobsterClient {
    private Integer aLobsterClientId;
    private String aLobsterClientName;
    private String aLobsterClientPwd;
    private Integer aLobsterClientAge;

    public Integer getaLobsterClientId() {
        return aLobsterClientId;
    }

    public void setaLobsterClientId(Integer aLobsterClientId) {
        this.aLobsterClientId = aLobsterClientId;
    }

    public String getaLobsterClientName() {
        return aLobsterClientName;
    }

    public void setaLobsterClientName(String aLobsterClientName) {
        this.aLobsterClientName = aLobsterClientName;
    }

    public String getaLobsterClientPwd(String aLobsterClientPwd) {
        return this.aLobsterClientPwd;
    }

    public void setaLobsterClientPwd(String aLobsterClientPwd) {
        this.aLobsterClientPwd = aLobsterClientPwd;
    }

    public Integer getaLobsterClientAge() {
        return aLobsterClientAge;
    }

    public void setaLobsterClientAge(Integer aLobsterClientAge) {
        this.aLobsterClientAge = aLobsterClientAge;
    }
}
