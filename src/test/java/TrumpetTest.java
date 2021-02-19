import Instruments.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("brass", "gold", InstrumentType.BRASS,3);
    }

    @Test
    public void trumpetHasNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", trumpet.play());
    }

    @Test
    public void trumpetHasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void trumpetHasColour(){
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void trumpetHasInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }



}
