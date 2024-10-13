class PostgreSQLFactory implements DatabaseFactory {
    @Override
    public Database createDatabase() {
        return new PostgreSQL();
    }
}