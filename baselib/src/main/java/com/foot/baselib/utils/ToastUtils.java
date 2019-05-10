package com.foot.baselib.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Author       :   lhhh
 * CreateDate   :   2019/5/9 17:45
 */
public class ToastUtils {
    private static Toast toast;

    private ToastUtils() {
    }


    public static void showToast(Context context, String msg) {
        if (null == context) {
            throw new IllegalArgumentException("The Context must not be null！");
        }
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
