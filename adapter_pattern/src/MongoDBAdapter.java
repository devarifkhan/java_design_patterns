class MongoDBAdapter implements Database {
    private MongoDB mongoDB;

    public MongoDBAdapter(MongoDB mongoDB) {
        this.mongoDB = mongoDB;
    }

    public void connect() {
        mongoDB.connectToMongo();
    }

    public void query(String sql) {
        mongoDB.execute(sql);
    }
}
