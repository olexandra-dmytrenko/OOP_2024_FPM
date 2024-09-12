package lecture1.carexample;

// Клас (також є типом)
public class Car {
    private String model;
    private int year;
    private int fuelLevel;

    public Car() {
        fuelLevel = 100;
    }

    public Car(int fuelLevelNew) {
        this.fuelLevel = fuelLevelNew;
    }

    public void drive(int distance) {
        while (distance >= 10) {
            distance = distance - 10;
            fuelLevel--;
        }
        System.out.println("Car is driving. Fuel level is " + fuelLevel);
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}