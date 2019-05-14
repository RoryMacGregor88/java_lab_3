import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "A2");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("A2", radio.getModel());
    }

    @Test
    public void canTune(){
        assertEquals("Tuned to Radio 1", radio.tune("Radio 1"));
    }
}
