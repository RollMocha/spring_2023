package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DUseDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}