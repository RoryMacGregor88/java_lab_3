public abstract class Component {
    protected String make;
    protected String model;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

}
