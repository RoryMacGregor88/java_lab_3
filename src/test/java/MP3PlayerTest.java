import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Radio radio;
    MP3Player mp3Player;
    Stereo stereo;
    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "A1", 6);
        recordDeck = new RecordDeck("Sony", "A2");
        radio = new Radio("Sony", "A3");
        stereo = new Stereo(cdPlayer, recordDeck, radio, "SuperDuperStereo", 11);
        mp3Player = new MP3Player("Apple", "iPod");
    }

    @Test
    public void hasMake(){
        assertEquals("Apple", mp3Player.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("iPod", mp3Player.getModel());
    }

    @Test
    public void canConnectToStereo(){
        assertEquals("Connected to SuperDuperStereo", mp3Player.connect(stereo));
    }
}
