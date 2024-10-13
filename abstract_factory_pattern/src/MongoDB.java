class MongoDB implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MongoDB database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MongoDB database.");
    }
}