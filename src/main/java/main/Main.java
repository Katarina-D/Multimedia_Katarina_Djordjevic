package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {
        
        Television television = new Television();
        television.setVolume(30);
        television.setCurrentProgram(4);
        television.setTurnOn(true);
        
        television.info();
        
        Radio radio = new Radio();
        radio.setFmFrequency(503);
        radio.setAmFrequency(202);
        radio.setBand('F');
        
        radio.info();
    }
    
}
