package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Gorgorod");
        songs.add("10 let ");
        songs.add("Who killed Mark?");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}