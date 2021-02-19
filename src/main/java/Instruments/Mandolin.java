package Instruments;

import Interfaces.ISell;

public class Mandolin extends Instruments implements ISell {

    private int numberOfMandolinStrings;

    public Mandolin(String material, String colour, InstrumentType instrumentType,int numberOfMandolinStrings){
        super(material, colour, instrumentType);
        this.numberOfMandolinStrings = numberOfMandolinStrings;
    }

    public int getNumberOfMandolinStrings() {
        return numberOfMandolinStrings;
    }

    public double markUp() {
        return 0;
    }
}
