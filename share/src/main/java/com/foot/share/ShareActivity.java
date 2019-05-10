package com.foot.share;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.foot.componentbase.ARouterPath;
import com.foot.componentbase.ServiceFactory;


@Route(path = ARouterPath.PATH_SHARE_SHARE)
public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        share();
    }

    private void share() {
        if (ServiceFactory.getInstance().getAccountService().isLogin()) {
            Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "please login", Toast.LENGTH_SHORT).show();
        }
    }
}
