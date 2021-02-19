package Instruments;

import Interfaces.IPlay;

public class Piano extends Instruments implements IPlay {

    private int numberOfPianoKeys;

    public Piano(String material, String colour, InstrumentType instrumentType, int numberOfPianoKeys){
        super(material, colour, instrumentType);
        this.numberOfPianoKeys = numberOfPianoKeys;
    }

    public int getNumberOfPianoKeys() {
        return numberOfPianoKeys;
    }

    public String play() {
        return "plinky plonk";
    }
}
