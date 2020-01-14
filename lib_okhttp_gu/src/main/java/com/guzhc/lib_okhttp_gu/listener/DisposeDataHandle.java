package com.guzhc.lib_okhttp_gu.listener;

/**
 * @author : GuZhC
 * @date : 2020-01-14 06:39
 * @description : DisposeDataHandle
 */
public class DisposeDataHandle {

    public DisposeDataListener mListener = null;
    public Class<?> mClass = null;
    public String mSource = null;

    public DisposeDataHandle(DisposeDataListener listener) {
        this.mListener = listener;
    }

    public DisposeDataHandle(DisposeDataListener listener, Class<?> mClass) {
        this.mListener = listener;
        this.mClass = mClass;
    }
}
