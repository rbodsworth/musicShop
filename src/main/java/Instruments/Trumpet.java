package Instruments;

import Interfaces.IPlay;

public class Trumpet extends Instruments implements IPlay {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType instrumentType, int numberOfValves){
        super(material, colour, instrumentType);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves(){
        return numberOfValves;
    }

    public String play() {
        return "toot toot";
    }
}
