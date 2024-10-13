class MongoDB {
    public void connectToMongo() {
        System.out.println("Connected to MongoDB");
    }

    public void execute(String command) {
        System.out.println("Executing command on MongoDB: " + command);
    }
}
