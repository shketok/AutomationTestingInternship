package di_example;

public class DatabaseOperations {

    private IDatabaseConnection databaseConnection;

    public DatabaseOperations(IDatabaseConnection connection) {
        databaseConnection = connection;
    }

    public void executeOperation() {
        // какое-то получение данных
    }
}
