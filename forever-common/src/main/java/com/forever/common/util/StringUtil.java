package com.forever.common.util;

public final class StringUtil {


    /**
     * 判断字符串是否为空
     * @param str str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }


    /**
     * 判断原始类型Obj字符串是否为空
     * @param obj str obj
     * @return
     */
    public static boolean isEmptyObjStr(Object obj) {
        return obj == null || obj.toString().trim().isEmpty();
    }


}
