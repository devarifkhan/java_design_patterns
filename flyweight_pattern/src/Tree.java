interface Tree {
    void draw(int x, int y);
}

class OakTree implements Tree {
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing an Oak Tree at coordinates (" + x + ", " + y + ")");
    }
}

class PineTree implements Tree {
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a Pine Tree at coordinates (" + x + ", " + y + ")");
    }
}
