package org.example;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class RockMusic implements  Music {
   private List<String> songs1= new ArrayList<>(); {
        songs1.add("Hungarian Rhapsody");
        songs1.add("Symphony no. 5 in C Minor, op. 67");
        songs1.add("Night on Bald Mountain");
    }


    @Override
    public List<String> getSong() {
        return songs1 ;
    }


}
