import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() { piano = new Piano(88);}

    @Test
    public void pianoHasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfPianoKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("plinky plonk", piano.play());
    }
}



