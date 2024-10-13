//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrototypePattern {
    public static void main(String[] args) {
        // Create a base product
        ConcreteProduct originalProduct = new ConcreteProduct("Medium", "Red");  // Creating original product

        // Clone the product
        ConcreteProduct clonedProduct = (ConcreteProduct) originalProduct.clone();  // Cloning the product

        // Show details of both products
        System.out.println("Original: " + originalProduct.getDetails());
        System.out.println("Cloned: " + clonedProduct.getDetails());
    }
}