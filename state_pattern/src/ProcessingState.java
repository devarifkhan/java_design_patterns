class ProcessingState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order is being processed. You can't cancel it now.");
    }
}