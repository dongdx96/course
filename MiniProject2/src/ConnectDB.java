import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private String url = "jdbc:mysql://localhost:3306/coursetraining";
    private String user = "root";
    private String pass = "";
    public Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
