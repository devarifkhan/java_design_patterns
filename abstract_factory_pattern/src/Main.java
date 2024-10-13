//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DatabaseFactory factory;

        factory = new PostgreSQLFactory();
        Database postgres = factory.createDatabase();
        postgres.connect();
        postgres.disconnect();

        factory = new MongoDBFactory();
        Database mongo = factory.createDatabase();
        mongo.connect();
        mongo.disconnect();
    }
}
