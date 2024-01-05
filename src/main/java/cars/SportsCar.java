package cars;

class SportsCar extends Car {
    private int mileage;

    public SportsCar(String make, String model, int year, double cost, double fuelEfficiency, int maxSpeed, int mileage) {
        super(make, model, year, cost, fuelEfficiency, maxSpeed);
        this.mileage = mileage;
    }
}