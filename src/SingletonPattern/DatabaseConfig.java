package SingletonPattern;

public class DatabaseConfig {
    private DatabaseConfig() {
    }

    private static class Holder {
        private static final DatabaseConfig INSTANCE = new DatabaseConfig();
    }

    public static DatabaseConfig getInstance() {
        return Holder.INSTANCE;
    }
}
