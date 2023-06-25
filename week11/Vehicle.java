
class Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void brake() {
        System.out.println("Braking...");
    }
}


class Car extends Vehicle{
    private String color;
    private boolean isAutomatic;
    private boolean isFourWheelDrive;

    public Car(String make, String model, int year, String color, boolean isAutomatic, boolean isFourWheelDrive) {
        super(make, model, year);
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.isFourWheelDrive = isFourWheelDrive;
    }
    
    // Getters
    public String getColor() {
        return color;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }

    public void Beep() {
        System.out.println("The car goes Beep Beep Beep");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car...");
    }

    @Override
    public void brake() {
        System.out.println("Braking the car...");
    }
}