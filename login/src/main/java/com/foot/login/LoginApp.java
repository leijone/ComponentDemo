package com.foot.login;

import android.app.Application;

import com.foot.baselib.BaseApp;
import com.foot.componentbase.ServiceFactory;

/**
 * Author       :   lhhh
 * CreateDate   :   2019/5/9 14:53
 */
public class LoginApp extends BaseApp {


    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
