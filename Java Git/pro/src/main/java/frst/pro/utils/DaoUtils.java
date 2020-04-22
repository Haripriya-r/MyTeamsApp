package frst.pro.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DaoUtils {
	public static  SessionFactory sessionFactory=null;
	
	private DaoUtils()
	{}
	
	public static SessionFactory daoConnection() {
		if(sessionFactory==null) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
        srb.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = srb.build();
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
       
        return sessionFactory;
        
		}
		else {
			return sessionFactory;
			
		}
        
	}

}
