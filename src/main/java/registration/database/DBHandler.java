package registration.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.view.globalConstants;


public class DBHandler extends Config {
    Connection dbConnection;
    public Connection getDBConnection () throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        return dbConnection = DriverManager.getConnection(connectionString, dbName, dbPass) ;
    }
    public void registration (String firstName, String middleName, String lastName, String nickName) {
        String toSQL =
        "INSERT INTO" +
        globalConstants.USER_TABLE +
        "(" +
        globalConstants.USER_FIRSTNAME_TABLE +
        "," +
        globalConstants.USER_MIDDLENAME_TABLE +
        "," +
        globalConstants.USER_LASTNAME_TABLE +
        "," +
        globalConstants.USER_NICKNAME_TABLE +
        ")" +
        "VALUES(?,?,?,?)";

        try {
            PreparedStatement prStatement = getDBConnection().prepareStatement(toSQL);

            prStatement.setString(1, firstName);
            prStatement.setString(2, middleName);
            prStatement.setString(3, lastName);
            prStatement.setString(4, nickName);

            prStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
