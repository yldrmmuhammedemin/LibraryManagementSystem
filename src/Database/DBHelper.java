package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper extends VeritabaniBaglantisi{

    private static String userName = "root";
    private static String password = "12345";
    private static String dbUrl = "jdbc:mysql://localhost:3306/kutuphaneotomasyonu?useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Connection getConnection;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error:" + exception.getMessage());
        System.out.println("Error code:" + exception.getErrorCode());
    }

}
