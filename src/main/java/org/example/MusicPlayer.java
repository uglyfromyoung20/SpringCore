package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
   @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
     private List<Music>  musicalList;

    public MusicPlayer(List<Music> musicList) {
        this.musicalList=musicList;
    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }




    public String playMusic() {
        Random random = new Random();
        return "Playing:"+ musicalList.get(random.nextInt(musicalList.size())).getSong()+"  "+ "with volume:"+ getVolume();
    }
}