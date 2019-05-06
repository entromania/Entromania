package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.matchVo;
import Vo.stadiumVo;

public class matchDao {

	public void insert(matchVo matchvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(matchvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List search(matchVo matchvo){
		List ls = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From matchVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	public void delete(matchVo matchvo){
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(matchvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public List edit(matchVo matchvo){
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From matchVo where id='"+matchvo.getM_id()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	public void update(matchVo matchvo){
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(matchvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public List loadstadium(stadiumVo stadiumvo){
		List lss = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From stadiumVo");
			q.list();
			lss=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return lss;
	}
	public List loadmatch(matchVo matchvo) {
		List lm = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From matchVo");
			q.list();
			lm=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return lm;
	}
}
