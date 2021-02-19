import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood","black", InstrumentType.GUITAR, "Fender", "Telecaster", 6);
    }

    @Test
    public void guitarHasBrandName(){
        assertEquals("Fender", guitar.getGuitarBrandName() );
    }

    @Test
    public void guitarHasModelName(){
        assertEquals("Telecaster", guitar.getGuitarModelName() );
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfGuitarStrings() );
    }

    @Test
    public void canPlay(){
        assertEquals("sweet guitar riffs", guitar.play());
    }

    @Test
    public void guitarHasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void guitarHasColour(){
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void guitarHasInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
    }




}
