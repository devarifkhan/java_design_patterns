//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.setState(new PendingState());
        order.applyState(); // Output: Order is in Pending state. You can cancel it.

        order.setState(new ProcessingState());
        order.applyState(); // Output: Order is being processed. You can't cancel it now.

        order.setState(new ShippedState());
        order.applyState(); // Output: Order has been shipped. You can't cancel it now.

        order.setState(new DeliveredState());
        order.applyState(); // Output: Order has been delivered. Now you can give a review.
    }
}