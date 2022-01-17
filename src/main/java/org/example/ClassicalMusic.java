package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    // создание приватного конструктора , чтобы нельзся было создавать его объекты через new
    private ClassicalMusic(){

    }
    //создание Fabric-method
    public static ClassicalMusic getClassicalMusic(){
        return  new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }
    @Override
    public String getSong() {
        return "rapGod";
    }
}