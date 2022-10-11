package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        System.out.println("Connection OK");

        UserDao userDao = new UserDaoJDBCImpl();

            userDao.createUsersTable();
            userDao.saveUser("Name1", "LastName1", (byte) 20);
            System.out.println("User с именем – Name1 добавлен в базу данных");
            userDao.saveUser("Name2", "LastName2", (byte) 25);
            System.out.println("User с именем – Name2 добавлен в базу данных");
            userDao.saveUser("Name3", "LastName3", (byte) 31);
            System.out.println("User с именем – Name3 добавлен в базу данных");
            userDao.saveUser("Name4", "LastName4", (byte) 38);
            System.out.println("User с именем – Name4 добавлен в базу данных");

            System.out.println(userDao.getAllUsers().toString());
            userDao.cleanUsersTable();
            userDao.dropUsersTable();
    }
}
