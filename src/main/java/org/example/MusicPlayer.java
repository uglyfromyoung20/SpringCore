package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;


    public void setMusic(Music music) {
        this.music = music;
    }
    @Autowired
   public void  setwMusic(){
        this.music = music;
   }

    public void playMusic(){
        System.out.println("Playing:"+ music.getSong());
    }
}
