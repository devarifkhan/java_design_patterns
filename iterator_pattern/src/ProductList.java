class ProductList implements ProductCollection {
    private Product[] products;
    private int index = 0;

    public ProductList(int size) {
        products = new Product[size];
    }

    public void addProduct(Product product) {
        if (index < products.length) {
            products[index] = product;
            index++;
        }
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}