package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.bookconcertVo;
import Vo.bookconcertdetailVo;

public class bookconcertDao {

	public void insert(bookconcertVo bookconcertvo) {
	
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(bookconcertvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void insertdetails(bookconcertdetailVo bookconcertdetailVo) {
		
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(bookconcertdetailVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
	}
	public List search(bookconcertVo bookconcertvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From bookconcertVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	
	public List searchbooked(bookconcertdetailVo bookconcertdetailVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From bookconcertdetailVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
		
	public List searchbookingdetails() {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From bookconcertdetailVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
}
