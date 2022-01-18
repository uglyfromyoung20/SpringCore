package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private Music music1;
@Autowired
public MusicPlayer(@Qualifier("rockMusic") Music music , @Qualifier("classicalMusic")Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public String playMusic(){
        return "Playing:"+ music.getSong() + "," + music1.getSong();

    }
}
