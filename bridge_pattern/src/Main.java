public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Shape circle = new Circle(vectorRenderer, 5);
        circle.draw(); // Output: Drawing a Circle with radius: 5.0 using Vector Renderer

        Shape square = new Square(vectorRenderer, 4);
        square.draw(); // Output: Drawing a Square with side: 4.0 using Vector Renderer

        Renderer rasterRenderer = new RasterRenderer();
        Shape anotherCircle = new Circle(rasterRenderer, 3);
        anotherCircle.draw(); // Output: Drawing a Circle with radius: 3.0 using Raster Renderer
    }
}
