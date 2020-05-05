public class Car extends vehicle {

    private double speed;

    public Car(){
        super();
        this.speed = 0;
    }

    public Car(String model, String color,double speed){
        super(model, color);
        this.speed = speed;
    }

    public String start(){
        return "The " + getColor() + " " + getModel() + " is starting.";
    }

    public String stop(){
        return "The " + getColor() + " " + getModel() + " is stopped.";
    }

    public String accelerate(){
        return "The " + getColor() + " " + getModel() + " is accelerating.";
    }

    public String emissionTest(){
        return "The "  + getColor() + " " + getModel() + " has stopped to have its emissions checked.";
    }
    public String emissionResult(){
        return "The " + getColor() + " " + getModel() + " has stopped to have its emission test";
    }

    public String speed(){
        return "The " + getColor() + " " + getModel() + " is going " + getSpeed() + " mph.";
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }



}
