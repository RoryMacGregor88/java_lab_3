import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sony", "A1");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("A1", recordDeck.getModel());
    }

    @Test
    public void hasPlaySpeeds(){
        assertEquals(12, recordDeck.getPlaySpeed1());
        assertEquals(10, recordDeck.getPlaySpeed2());
        assertEquals(6, recordDeck.getPlaySpeed3());
    }

    @Test
    public void canPlay(){
        assertEquals("Record playing", recordDeck.play());
    }


}
