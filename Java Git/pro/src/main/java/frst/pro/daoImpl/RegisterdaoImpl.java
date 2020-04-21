package frst.pro.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import frst.pro.bo.Loginbo;
import frst.pro.bo.Registerbo;

public class RegisterdaoImpl {
	public  int createRegister(Registerbo registerbo) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder srb = new StandardServiceRegistryBuilder();
        srb.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = srb.build();
        
        //Create SessionFacctory
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        //Create Session from SessionFactory
        Session session = sessionFactory.openSession();
        
        //Begin the transaction
        session.beginTransaction();
        
       
        
        //Persist the employee object
        session.save(registerbo);
        
        //Commit the changes
        session.getTransaction().commit();
        //Close the session
        session.close();
    

		return 1;
		
		
	}

}
