//Tạo một lớp "DatabaseManager" có thuộc tính final static là "MAX_CONNECTIONS" đại diện cho số lượng kết nối tối đa đến cơ sở dữ liệu. Viết phương thức static để trả về giá trị của MAX_CONNECTIONS và phương thức để thiết lập giá trị mới cho MAX_CONNECTIONS.
package hv.ntyen.b6_DaHinh_TruuTuong;

public class DatabaseManager {
    private  static int MAX_CONNECTIONS = 15;
    public static int getMaxConnections() {
        return MAX_CONNECTIONS;
    }

    public static void setMaxConnections(int maxConnections) {
        if (maxConnections <= 0) {
            throw new IllegalArgumentException("Max connections must be a positive integer.");
        }
        MAX_CONNECTIONS = maxConnections;

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
