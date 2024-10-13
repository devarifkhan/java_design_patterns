interface Renderer {
    void renderCircle(float radius);
    void renderSquare(float side);
}

class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a Circle with radius: " + radius + " using Vector Renderer");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a Square with side: " + side + " using Vector Renderer");
    }
}

class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a Circle with radius: " + radius + " using Raster Renderer");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a Square with side: " + side + " using Raster Renderer");
    }
}

abstract class Shape {
    protected Renderer renderer; // ব্রিজ

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    abstract void draw(); // ড্র করার জন্য পদ্ধতি
}

class Circle extends Shape {
    private float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    void draw() {
        renderer.renderCircle(radius);
    }
}

class Square extends Shape {
    private float side;

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    void draw() {
        renderer.renderSquare(side);
    }
}
