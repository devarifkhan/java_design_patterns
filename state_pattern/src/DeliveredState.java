class DeliveredState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Order has been delivered. Now you can give a review.");
    }
}