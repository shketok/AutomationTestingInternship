package di_example;

public class SecondDatabaseConnection implements IDatabaseConnection {
    @Override
    public void createConnection() {
        // тут должно быть подключение к БД.
    }
}
