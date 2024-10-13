public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        image1.display(); // Output: Loading photo1.jpg

        image1.display(); // Output: Displaying photo1.jpg

        image2.display(); // Output: Loading photo2.jpg
    }
}
