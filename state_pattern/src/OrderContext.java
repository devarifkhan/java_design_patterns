class OrderContext {
    private OrderState currentState;

    public void setState(OrderState state) {
        currentState = state;
    }

    public void applyState() {
        currentState.handleRequest();
    }
}