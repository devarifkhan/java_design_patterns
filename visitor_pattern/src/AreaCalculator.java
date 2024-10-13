class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Calculating area of Circle");
        // Area calculation logic for Circle
    }

    @Override
    public void visit(Square square) {
        System.out.println("Calculating area of Square");
        // Area calculation logic for Square
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Calculating area of Rectangle");
        // Area calculation logic for Rectangle
    }
}
