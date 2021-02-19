import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Telecaster", 6);
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


}
