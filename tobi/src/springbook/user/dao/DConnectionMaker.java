package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DConnectionMaker  implements ConnectionMaker {
    public UserDao(){

    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.makeConnection();
    }

    public void get(String id) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.makeConnection();
    }
}
