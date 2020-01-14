package com.guzhc.lib_okhttp_gu.listener;

/**
 * @author : GuZhC
 * @date : 2020-01-14 07:37
 * @description : DisposeDownloadListener
 */
public interface DisposeDownloadListener extends DisposeDataListener {
    void onProgress(int progress);
}
