package Instruments;

public abstract class Instruments {

    private String material;
    private String colour;
    private InstrumentType instrumentType;

    public Instruments(String material, String colour, InstrumentType instrumentType){
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
