public class VehicleApp {
    public static void main(String[] args) {
        Car userCar = new Car("Toyota", "Corolla", 2018, "Blue", false, false);
        System.out.println("You have a "+userCar.getColor()+" "+userCar.getYear()+ " "+userCar.getMake()+" "+userCar.getModel());
        System.out.println("Lets take it for a test drive.");
        userCar.startEngine();
        userCar.accelerate();
        System.out.println("Oh wait I see my friend. Give him a beep and lets pull over here to have a chat.");
        userCar.brake();
        userCar.Beep();
        userCar.stopEngine();
    }
}
