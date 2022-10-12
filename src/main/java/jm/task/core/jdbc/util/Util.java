package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.imageio.spi.ServiceRegistry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/userdb";
    private static final String userName = "root";
    private static final String password = "Lala88lala88lalacr-v";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static SessionFactory sessionFactory;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // public static SessionFactory getSessionFactory() {
    //if (sessionFactory == null) {
    // try {
    // Configuration configuration = new Configuration();
    //  Properties properties = new Properties();
    //   properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
    //   properties.put(Environment.URL, "jdbc:mysql://127.0.0.1:3306/userdb");
    //   properties.put(Environment.USER, "root");
    //     properties.put(Environment.PASS, "Lala88lala88lalacr-v");
    //    properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
    //   properties.put(Environment.SHOW_SQL, "true");
    //  properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
    //  properties.put(Environment.HBM2DDL_AUTO, "create-drop");
//
    //  configuration.setProperties(properties);

    // configuration.addAnnotatedClass(User.class);

    // ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder()
    //     .applySettings(configuration.getProperties()).build();

    //  sessionFactory = configuration.buildSessionFactory((org.hibernate.service.ServiceRegistry) serviceRegistry);
    // } catch (Exception e) {
    //     System.out.println(e.getMessage());
    //}
    // }
    //  return sessionFactory;
    // }
}
