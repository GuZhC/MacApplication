package com.guzhc.lib_audio_gu.mediaplayer.core;

import android.media.MediaPlayer;

import java.io.IOException;

/**
 * @author : GuZhC
 * @date : 2020-01-16 07:44
 * @description : 带状态的MediaPlayer
 */
public class CustomMediaPlayer extends MediaPlayer implements MediaPlayer.OnCompletionListener {

    public enum Status {
        IDLE, INITIALIZED, STARTED, PAUSED, STOPPED, COMPLETED
    }


    private Status mState;

    private OnCompletionListener mOnCompletionListener;

    public CustomMediaPlayer() {
        super();
        mState = Status.IDLE;
        super.setOnCompletionListener(this);
    }

    @Override
    public void reset() {
        super.reset();
        mState = Status.IDLE;
    }

    @Override
    public void setDataSource(String path) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        super.setDataSource(path);
        mState = Status.INITIALIZED;
    }


    @Override
    public void start() throws IllegalStateException {
        super.start();
        mState = Status.STARTED;
    }


    @Override
    public void setOnCompletionListener(OnCompletionListener listener) {
        this.mOnCompletionListener = listener;
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        mState = Status.COMPLETED;
        if (mOnCompletionListener != null) {
            mOnCompletionListener.onCompletion(mp);
        }
    }

    @Override
    public void stop() throws IllegalStateException {
        super.stop();
        mState = Status.STOPPED;
    }

    @Override
    public void pause() throws IllegalStateException {
        super.pause();
        mState = Status.PAUSED;
    }

    public Status getState() {
        return mState;
    }

    public void setState(Status mState) {
        this.mState = mState;
    }

    public boolean isComplete() {
        return mState == Status.COMPLETED;
    }
}



















