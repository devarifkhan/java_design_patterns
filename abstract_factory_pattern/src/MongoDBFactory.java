class MongoDBFactory implements DatabaseFactory {
    @Override
    public Database createDatabase() {
        return new MongoDB();
    }
}