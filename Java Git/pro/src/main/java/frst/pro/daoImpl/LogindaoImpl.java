package frst.pro.daoImpl;

import java.util.List;
import java.util.ListIterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import frst.pro.bo.Loginbo;
import frst.pro.dao.Logindao;
import frst.pro.utils.DaoUtils;

public class LogindaoImpl implements Logindao
{
 
	public  boolean createLogin(Loginbo loginbo) {
		boolean ValidUser=false;
		
		SessionFactory sessionFactory= DaoUtils.daoConnection();
		 Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Loginbo.class);
		criteria.add(Restrictions.eq("email",loginbo.getEmail()));
		criteria.add(Restrictions.eq("password",loginbo.getPassword()));
		List results = criteria.list();
		if(results.isEmpty()) {
			ValidUser=false;
			
		}
		else {
			ValidUser=true;
			
		}
			
		
		 session.close();
		 return ValidUser;		
		
		
			}



}
