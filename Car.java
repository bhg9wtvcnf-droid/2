public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() { return numberOfDoors; }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors <= 0)
            throw new IllegalArgumentException("numberOfDoors must be > 0");
        this.numberOfDoors = numberOfDoors;
    }

    public double calculateInsuranceFee() {
        int currentYear = java.time.Year.now().getValue();
        int age = getAge(currentYear);
        return basePrice * 0.03 + age * 10.0;
    }

    public void performService() {
        System.out.println("Car service: oil change, filters check, diagnostics.");
    }

    public int getServiceIntervalKm() {
        return 10000;
    }
}
