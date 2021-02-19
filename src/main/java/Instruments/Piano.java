package Instruments;

import Interfaces.IPlay;

public class Piano implements IPlay {

    private int numberOfPianoKeys;

    public Piano(int numberOfPianoKeys){
        this.numberOfPianoKeys = numberOfPianoKeys;
    }

    public int getNumberOfPianoKeys() {
        return numberOfPianoKeys;
    }

    public String play() {
        return "plinky plonk";
    }
}
