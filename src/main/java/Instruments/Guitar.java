package Instruments;

import Interfaces.IPlay;

public class Guitar implements IPlay {

    private String guitarBrandName;
    private String guitarModelName;
    private int numberOfGuitarStrings;

    public Guitar(String guitarBrandName, String guitarModelName, int numberOfGuitarStrings){
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
        return "Sweet guitar riffs";
    }
}
