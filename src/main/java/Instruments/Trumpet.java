package Instruments;

import Interfaces.IPlay;

public class Trumpet implements IPlay {

    private int numberOfValves;

    public Trumpet(int numberOfValves){
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves(){
        return numberOfValves;
    }

    public String play() {
        return "toot toot";
    }
}
