package com.guzhc.lib_okhttp_gu.listener;

/**
 * @author : GuZhC
 * @date : 2020-01-14 06:40
 * @description : DisposeDataListener
 */
public interface DisposeDataListener {
    void onSuccess(Object responseObj);
    void onFailure(Object reasonObj);
}
