public class CDPlayer extends Component implements IPlay{

    private int numberOfCDs;

    public CDPlayer(String make, String model, int numberOfCDs) {
        super(make, model);
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return numberOfCDs;
    }

    public String play(){
        return "CD playing";
    }
}
