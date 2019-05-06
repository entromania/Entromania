package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.LoginVo;
import Vo.RegistrationVo;

public class RegistrationDao {

	public void insert(RegistrationVo registrationvo) {
		
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(registrationvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List searchDetails(LoginVo loginvo) {
		// TODO Auto-generated method stub
		List ls= new ArrayList();
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =  sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			System.out.println("Searching Login Record");
			
			Query q = session.createQuery("from RegistrationVo where loginId='"+loginvo.getLoginId()+"'");
			ls = q.list();
			tr.commit();
			
			System.out.println("Done");
			
			session.flush();
			session.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
}
