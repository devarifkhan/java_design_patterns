class OrderFacade {
    private OrderSystem orderSystem;
    private PaymentSystem paymentSystem;
    private InventorySystem inventorySystem;
    private ShippingSystem shippingSystem;

    public OrderFacade() {
        this.orderSystem = new OrderSystem();
        this.paymentSystem = new PaymentSystem();
        this.inventorySystem = new InventorySystem();
        this.shippingSystem = new ShippingSystem();
    }

    public void placeOrder(String item, int quantity, String paymentType, double amount) {
        if (inventorySystem.checkStock(item, quantity)) {
            orderSystem.placeOrder(item, quantity);
            paymentSystem.processPayment(paymentType, amount);
            shippingSystem.arrangeShipping(item, quantity);
            System.out.println("Order processing completed for item: " + item);
        } else {
            System.out.println("Insufficient stock for item: " + item);
        }
    }
}
