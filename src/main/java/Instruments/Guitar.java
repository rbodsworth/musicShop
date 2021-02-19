package Instruments;

import Interfaces.IPlay;

public class Guitar extends Instruments implements IPlay {

    private String guitarBrandName;
    private String guitarModelName;
    private int numberOfGuitarStrings;

    public Guitar(String material, String colour, InstrumentType instrumentType, String guitarBrandName, String guitarModelName, int numberOfGuitarStrings){
        super(material, colour, instrumentType);
        this.guitarBrandName = guitarBrandName;
        this.guitarModelName = guitarModelName;
        this.numberOfGuitarStrings = numberOfGuitarStrings;
    }

    public String getGuitarBrandName() {
        return guitarBrandName;
    }

    public String getGuitarModelName() {
        return guitarModelName;
    }

    public int getNumberOfGuitarStrings() {
        return numberOfGuitarStrings;
    }

    public String play() {
        return "sweet guitar riffs";
    }
}
