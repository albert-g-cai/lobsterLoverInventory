/**
 * Created by Albert Cai.
 *         Date: 2022/10/9
 *         Time: 2:25
 */

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
