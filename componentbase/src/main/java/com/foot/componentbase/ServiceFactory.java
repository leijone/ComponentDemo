package com.foot.componentbase;

import com.foot.componentbase.service.IAccountService;
import com.foot.componentbase.service_empty.EmptyAccountService;

/**
 * Author       :   lhhh
 * CreateDate   :   2019/5/9 14:23
 */
public class ServiceFactory {
    private IAccountService accountService;

    private ServiceFactory(){}

    private static class Inner{
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    public static ServiceFactory getInstance(){
        return Inner.serviceFactory;
    }

    public void setAccountService(IAccountService accountService){
        this.accountService = accountService;
    }

    public IAccountService getAccountService(){
        if (accountService ==null){
            accountService = new EmptyAccountService();
        }

        return accountService;
    }
}
