package Dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.ContactUsVo;

public class ContactUsDao {

	public void insert(ContactUsVo contactUsVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(contactUsVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
