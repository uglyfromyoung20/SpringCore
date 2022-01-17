package org.example;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class RockMusic implements  Music {
    @Override
    public String getSong() {
        return "Skillet";
    }


}
