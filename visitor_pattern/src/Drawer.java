class Drawer implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing Circle");
        // Drawing logic for Circle
    }

    @Override
    public void visit(Square square) {
        System.out.println("Drawing Square");
        // Drawing logic for Square
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing Rectangle");
        // Drawing logic for Rectangle
    }
}