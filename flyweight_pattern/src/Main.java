public class Main {
    public static void main(String[] args) {
        Tree oakTree = TreeFactory.getTree("Oak");
        oakTree.draw(10, 20);

        Tree pineTree = TreeFactory.getTree("Pine");
        pineTree.draw(30, 40);

        Tree anotherOakTree = TreeFactory.getTree("Oak");
        anotherOakTree.draw(50, 60);
    }
}
