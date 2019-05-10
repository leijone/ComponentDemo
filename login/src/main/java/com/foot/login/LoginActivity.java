package com.foot.login;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.foot.baselib.utils.ToastUtils;
import com.foot.componentbase.ARouterPath;
import com.foot.login.bean.User;
import com.foot.login.utils.AccountUtils;

@Route(path = ARouterPath.PATH_LOGIN_LOGIN)
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void onLogin(View view) {
        User user = new User();
        user.id = "112321312";
        user.name = "jeck";
        AccountUtils.user = user;
        ToastUtils.showToast(this, "欢迎用户：user" + user.name);
    }

    public void onLogout(View view) {
        AccountUtils.user = null;
        ToastUtils.showToast(this, "退出登录");
    }

    public void onShare(View view) {
        if (AccountUtils.isLogin()) {
            ARouter.getInstance().build(ARouterPath.PATH_SHARE_SHARE).withString("share_content", "分享到微信").navigation();
        } else {
            ToastUtils.showToast(this, "请先登录");
        }
    }


}
