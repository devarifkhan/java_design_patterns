import java.util.HashMap;

class TreeFactory {
    private static final HashMap<String, Tree> trees = new HashMap<>();

    public static Tree getTree(String type) {
        Tree tree = trees.get(type);
        if (tree == null) {
            if (type.equals("Oak")) {
                tree = new OakTree();
            } else if (type.equals("Pine")) {
                tree = new PineTree();
            }
            trees.put(type, tree);
        }
        return tree;
    }
}
