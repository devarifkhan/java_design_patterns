class PendingState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order is in Pending state. You can cancel it.");
    }
}