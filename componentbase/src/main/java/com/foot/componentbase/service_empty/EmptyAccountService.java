package com.foot.componentbase.service_empty;

import com.foot.componentbase.service.IAccountService;

/**
 * Author       :   lhhh
 * CreateDate   :   2019/5/9 14:24
 */
public class EmptyAccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
