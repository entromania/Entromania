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

public class LoginDao {

	public void insert(LoginVo loginvo)
	{
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(loginvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public List authentication(LoginVo loginvo) {
		// TODO Auto-generated method stub
		List ls= new ArrayList();
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =  sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			System.out.println("Searching Login Record");
			
			Query q = session.createQuery("from LoginVo where email='"+loginvo.getEmail()+"' and password='"+loginvo.getPassword()+"'");
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
	
	public List searchAdmin() {
		// TODO Auto-generated method stub
		List ls= new ArrayList();
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =  sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			System.out.println("Searching Login Record");
			
			Query q = session.createQuery("from LoginVo where UserType='admin'");
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

	public List forgotpassword(LoginVo loginVo) {
		List ls =null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =  sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("from LoginVo where email='"+loginVo.getEmail()+"'");
			ls = q.list();
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void updatePassword(LoginVo loginVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =  sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("UPDATE LoginVo SET UserPassword='"+loginVo.getPassword()+"' where Email='"+loginVo.getEmail()+"'");
			q.executeUpdate();
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
