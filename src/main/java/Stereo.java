public class Stereo {

    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;
    private Radio radio;
    private String name;
    private int volume;

    public Stereo(CDPlayer cdPlayer, RecordDeck recordDeck, Radio radio, String name, int volume) {
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.radio = radio;
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String useRadio(String station) {
        return radio.tune(station);
    }

    public String playCD() {
        return cdPlayer.play();
    }

    public String spinRecord() {
        return recordDeck.play();
    }

    public void changeVolume(int changeInVolume) {
        volume += changeInVolume;
        if (volume < 0){
            volume = 0;
        } else if (volume > 11){
            volume = 11;
        }
    }
}
