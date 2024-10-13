class PostgreSQL implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL database");
    }

    public void query(String sql) {
        System.out.println("Executing query on PostgreSQL: " + sql);
    }
}