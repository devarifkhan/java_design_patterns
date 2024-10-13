// ConcreteProduct class implementing the Product interface
public class ConcreteProduct  implements Product{
    private String size;  // Size of the product
    private String color;  // Color of the product

    public ConcreteProduct(String size, String color) {
        this.size = size;  // Initializing size
        this.color = color;  // Initializing color
    }

    @Override
    public Product clone() {
        return new ConcreteProduct(size, color);  // Cloning the product
    }

    @Override
    public String getDetails() {
        return "Product size: " + size + ", color: " + color;  // Returning product details
    }
}
