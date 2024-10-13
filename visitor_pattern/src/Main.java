//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Rectangle()};

        AreaCalculator areaCalculator = new AreaCalculator();
        Drawer drawer = new Drawer();

        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
            shape.accept(drawer);
        }
    }
}