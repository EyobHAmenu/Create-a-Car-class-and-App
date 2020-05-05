public class CarApp {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Porsche");
        car1.setColor("Gray");
        car1.setSpeed(50);

        System.out.println("***********" + car1.getModel() +"***********");
        System.out.println(car1.start());
        System.out.println(car1.accelerate());
        System.out.println(car1.speed());
        System.out.println(car1.emissionTest());
        System.out.println(car1.emissionResult());

        Car car2 = new Car("BMW","RED",90);

        System.out.println("***********" + car2.getModel() +"***********");
        System.out.println(car2.start());
        System.out.println(car2.accelerate());
        System.out.println(car2.speed());
        System.out.println(car2.emissionTest());
        System.out.println(car2.emissionResult());

        System.out.println("*********** " + car1.getModel() + " vs " + car2.getModel() +" ***********");
        if (car1.getSpeed() > car2.getSpeed()){
            System.out.println("The " + car1.getColor() + " " + car1.getModel() + " just passed the " +
                    car2.getColor() + " " + car2.getModel());
        }else {
            System.out.println("The " + car2.getColor() + " " + car2.getModel() + " just passed the " +
                    car1.getColor() + " " + car1.getModel());
        }

    }
}
