public class Main {
    public static void main(String[] args) {

        Servicable s = new Car("Toyota", 2018, 12000, 4);
        s.performService();
        System.out.println("Interval: " + s.getServiceIntervalKm() + " km");

        Servicable s2 = new Bus("Yutong", 2015, 40000, 45);
        s2.performService();
        System.out.println("Interval: " + s2.getServiceIntervalKm() + " km");
    }
}
