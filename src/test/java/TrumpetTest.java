import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(3);
    }

    @Test
    public void trumpetHasNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", trumpet.play());
    }


}
