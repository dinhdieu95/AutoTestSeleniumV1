package learnjava.database.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnection {
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
}
