package lecture1.carexample;

public class UseCar {
    // Тип може бути використаний для оголошення змінних
    Car someCar;  // someCar має тип Car, але поки що не є об'єктом
    public static void main(String[] args) {
        // Використання
        Car myCar = new Car(60);  // myCar - це об'єкт класу Car
        Car yourCar = new Car(); // yourCar - інший об'єкт того ж класу

        myCar.drive(20);
        myCar.setFuelLevel(myCar.getFuelLevel() + 10);

        System.out.println(myCar.getFuelLevel());
    }
}
