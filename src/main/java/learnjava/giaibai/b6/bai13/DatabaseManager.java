package learnjava.giaibai.b6.bai13;

public class DatabaseManager {
    private static int MAX_CONNECTIONS = 10;

    public static int getMaxConnections() {
//        MAX_CONNECTIONS = 20;
        return MAX_CONNECTIONS;
    }

    public static void setMaxConnections(int maxConnections) {
        if (maxConnections <= 0) {
            throw new IllegalArgumentException("Max connections must be a positive integer.");
        }

//        MAX_CONNECTIONS = maxConnections;
    }

    public static void main(String[] args) {
        int currentMaxConnections = DatabaseManager.getMaxConnections();
        System.out.println("Current max connections: " + currentMaxConnections);

        int newMaxConnections = 20;
        DatabaseManager.setMaxConnections(newMaxConnections);

        int updatedMaxConnections = DatabaseManager.getMaxConnections();
        System.out.println("Updated max connections: " + updatedMaxConnections);
    }
}
