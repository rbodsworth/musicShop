import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() { piano = new Piano("wood", "white", InstrumentType.PIANO, 88);}

    @Test
    public void pianoHasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfPianoKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("plinky plonk", piano.play());
    }

    @Test
    public void pianoHasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void pianoHasColour(){
        assertEquals("white", piano.getColour());
    }

    @Test
    public void pianoHasInstrumentType(){
        assertEquals(InstrumentType.PIANO, piano.getInstrumentType());
    }

}



