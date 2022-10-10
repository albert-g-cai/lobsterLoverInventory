package com.lobsterWeb.entity.messageContainer;

/**
 *
 * message model entity for data response
 * state: 1=success, 0=fail
 * infoTip: char
 * dataReturn: object (could be String, or Integer, any)
 */
public class MessageModel {
    private Integer state=1;//state(1=success,0=fail)
    private String msg="success";//info related to the lobster client expecting
    private Object object;
    //return object(data, char, String/Integer/List/Map, etc)

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
