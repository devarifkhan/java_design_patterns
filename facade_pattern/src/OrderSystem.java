class OrderSystem {
    public void placeOrder(String item, int quantity) {
        System.out.println("Order placed for item: " + item + ", Quantity: " + quantity);
    }
}

class PaymentSystem {
    public void processPayment(String paymentType, double amount) {
        System.out.println("Payment processed via " + paymentType + " for amount $" + amount);
    }
}

class InventorySystem {
    public boolean checkStock(String item, int quantity) {
        System.out.println("Checking stock for item: " + item + ", Quantity: " + quantity);
        return true;
    }
}

class ShippingSystem {
    public void arrangeShipping(String item, int quantity) {
        System.out.println("Shipping arranged for item: " + item + ", Quantity: " + quantity);
    }
}
