//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyota = toyotaFactory.createCar();
        toyota.drive();

        CarFactory hondaFactory = new HondaFactory();
        Car honda = hondaFactory.createCar();
        honda.drive();
    }
}