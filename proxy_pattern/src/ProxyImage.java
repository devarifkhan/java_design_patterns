class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // আসল ইমেজ তৈরি করা হচ্ছে
        }
        realImage.display(); // ছবি প্রদর্শন করা হচ্ছে
    }
}