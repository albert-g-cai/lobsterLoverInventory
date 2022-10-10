package com.lobsterWeb.util;

/**
 *String or character process tools
 *
 */
public class StringUtil {
    public static boolean isEmpty(String string){
        if(string==null||"".equals(string.trim())){
            return true;
        }
        return false;
    }
}
