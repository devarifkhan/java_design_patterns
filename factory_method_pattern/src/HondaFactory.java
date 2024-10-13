class HondaFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
