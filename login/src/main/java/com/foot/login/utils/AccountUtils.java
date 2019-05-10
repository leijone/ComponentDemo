package com.foot.login.utils;

import com.foot.login.bean.User;

/**
 * Author       :   lhhh
 * CreateDate   :   2019/5/9 14:54
 */
public class AccountUtils {
    public static User user;

    private AccountUtils() {
    }

    public static boolean isLogin() {
        return user != null;
    }


}
