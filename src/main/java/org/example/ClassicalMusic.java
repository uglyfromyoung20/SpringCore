package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    // создание приватного конструктора , чтобы нельзся было создавать его объекты через new
    @Override
    public String getSong() {
        return "rapGod";
    }
}