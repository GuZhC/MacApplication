package com.guzhc.lib_audio_gu.events;


import com.guzhc.lib_audio_gu.model.AudioBean;

public class AudioLoadEvent {
  public AudioBean mAudioBean;

  public AudioLoadEvent(AudioBean audioBean) {
    this.mAudioBean = audioBean;
  }
}
