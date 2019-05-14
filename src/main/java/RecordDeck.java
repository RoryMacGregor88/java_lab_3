public class RecordDeck extends Component implements IPlay{

    private int playSpeed1;
    private int playSpeed2;
    private int playSpeed3;

    public RecordDeck(String make, String model) {
        super(make, model);
        this.playSpeed1 = 12;
        this.playSpeed2 = 10;
        this.playSpeed3 = 6;
    }

    public int getPlaySpeed1() {
        return playSpeed1;
    }

    public int getPlaySpeed2() {
        return playSpeed2;
    }

    public int getPlaySpeed3() {
        return playSpeed3;
    }

    public String play(){
        return "Record playing";
    }
}
