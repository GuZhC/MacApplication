package com.guzhc.lib_audio_gu.app;

import android.content.Context;

/**
 * @author : GuZhC
 * @date : 2020-01-17 07:13
 * @description : 唯一与外界通信的帮助类
 */
public final class AudioHelper {
    private static Context mContext;
    public static void init(Context context){
        mContext = context;

    }

//    public static void st
public static Context getContext() {
    return mContext;
}

}
