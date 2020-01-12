package com.guzhc.toastlib;

import android.content.Context;
import android.widget.Toast;

/**
 * @author : GuZhC
 * @date : 2019-12-25 07:19
 * @description : ToastUtil
 */
public class ToastUtil {
    public static void Toast(Context context,String s){
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
