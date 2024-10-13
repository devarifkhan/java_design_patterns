//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database postgresDB = new PostgreSQL();
        postgresDB.connect();
        postgresDB.query("SELECT * FROM users");

        // Using adapter for MongoDB
        MongoDB mongoDB = new MongoDB();
        Database mongoAdapter = new MongoDBAdapter(mongoDB);
        mongoAdapter.connect();
        mongoAdapter.query("db.users.find()");
    }
}