import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "N1000", 6);
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("N1000", cdPlayer.getModel());
    }

    @Test
    public void hasNumberOfCDs(){
        assertEquals(6, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canPlay(){
        assertEquals("CD playing", cdPlayer.play());
    }
}
