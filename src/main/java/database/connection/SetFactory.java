package database.connection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class SetFactory {
    private final SessionFactory sessionFactory;
    private String fileConfig;

    public SetFactory(String fileConfig) {
        this.fileConfig = fileConfig;
        sessionFactory = buildSessionFactory(fileConfig);
    }
    private SessionFactory buildSessionFactory(String fileConfig) {
        if (fileConfig != null && !fileConfig.equals("")) {
            ServiceRegistry serviceRegistry =
                    new StandardServiceRegistryBuilder().configure(fileConfig).build();
            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
        }
        return null;
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
