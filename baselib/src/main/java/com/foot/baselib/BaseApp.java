package com.foot.baselib;

import android.app.Application;

/**
 * Author       :   lhhh
 * CreateDate   :   2019/5/9 14:14
 */
public abstract class BaseApp extends Application {


    public abstract void initModuleApp(Application application);


    public abstract void initModuleData(Application application);
}
