package frst.pro.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import frst.pro.bo.Loginbo;
import frst.pro.bo.Registerbo;
import frst.pro.utils.DaoUtils;

public class RegisterdaoImpl {
	public  int createRegister(Registerbo registerbo) {
		Loginbo loginbo=new Loginbo();
		 DaoUtils.daoConnection();
		SessionFactory sessionFactory= DaoUtils.daoConnection();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
        session.save(registerbo);
        loginbo.setEmail(registerbo.getEmail());
        loginbo.setPassword(registerbo.getPassword());
        session.save(loginbo);
        
        session.getTransaction().commit();
        session.close();
        return 1;
		
		
	}

}
