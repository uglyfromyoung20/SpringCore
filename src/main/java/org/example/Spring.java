package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class Spring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//
//        classicalMusicPlayer.playMusic();


//        musicPlayer.playMusic();

        //Computer computer = context.getBean("computer", Computer.class);
        //System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
       System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}

// ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
// System.out.println(classicalMusic.getSong());
//Bean bean =  context.getBean("Bean", Bean.class);
//Music music =  context.getBean("musicBean1", Music.class);
// Music music2 =  context.getBean("classicalMusic", Music.class);
//MusicPlayer musicPlayer = new MusicPlayer(music);
// MusicPlayer musicPlayer1 = new MusicPlayer(music2);

// MusicPlayer musicPlayer= context.getBean("MusicPlayer",MusicPlayer.class);
// MusicPlayer musicPlayer1= context.getBean("MusicPlayer",MusicPlayer.class);
//boolean comp = musicPlayer==musicPlayer1;
// System.out.println(comp);
// musicPlayer.setVolume(30);
// System.out.println(musicPlayer);
// System.out.println(musicPlayer1);
//  musicPlayer.playMusic();
// musicPlayer1.playMusic();
// System.out.println(musicPlayer1.getVolume());
// System.out.println(musicPlayer.getVolume());




