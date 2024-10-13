class ShippedState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order has been shipped. You can't cancel it now.");
    }
}