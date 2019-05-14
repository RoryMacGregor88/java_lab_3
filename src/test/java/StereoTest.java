import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Radio radio;
    Stereo stereo;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "A1", 6);
        recordDeck = new RecordDeck("Sony", "A2");
        radio = new Radio("Sony", "A3");
        stereo = new Stereo(cdPlayer, recordDeck, radio, "SuperDuperStereo", 11);
    }

    @Test
    public void hasName(){
        assertEquals("SuperDuperStereo", stereo.getName());
    }

    @Test
    public void hasVolume(){
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void canUseRadio(){
        assertEquals("Tuned to ForthOne", stereo.useRadio("ForthOne"));
    }

    @Test
    public void canPlayCD(){
        assertEquals("CD playing", stereo.playCD());
    }

    @Test
    public void canSpinRecord(){
        assertEquals("Record playing", stereo.spinRecord());
    }

    @Test
    public void canChangeVolume(){
        stereo.changeVolume(-5);
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void cannotLowerVolumeBelow0(){
        stereo.changeVolume(-20);
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void cannotRaiseVolumeOver11(){
        stereo.changeVolume(4);
        assertEquals(11, stereo.getVolume());
    }

}
