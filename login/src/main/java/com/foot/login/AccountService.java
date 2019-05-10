package com.foot.login;

import com.foot.componentbase.service.IAccountService;
import com.foot.login.utils.AccountUtils;

/**
 * Author       :   lhhh
 * CreateDate   :   2019/5/9 14:52
 */
public class AccountService implements IAccountService {

    @Override
    public boolean isLogin() {
        return AccountUtils.user != null;
    }

    @Override
    public String getAccountId() {
        if (AccountUtils.user != null)
            return AccountUtils.user.id;
        else
            return null;
    }
}
