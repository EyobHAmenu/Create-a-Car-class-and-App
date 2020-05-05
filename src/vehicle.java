public class vehicle {
    private int numberOfWheels;
    private String model;
    private String color;

    public vehicle() {
        numberOfWheels = 4;
        model = "unknown";
        color = "unknown";
    }
    public vehicle(String model, String color){
        this.model = model;
        this.color = color;
    }

    public int getNumberOfWheels() { return numberOfWheels; }

    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
