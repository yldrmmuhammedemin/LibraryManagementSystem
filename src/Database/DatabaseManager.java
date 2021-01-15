package Database;

import Database.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseManager {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        try {
            connection = helper.getConnection();
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static void showErrorMessage(SQLException exception) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
