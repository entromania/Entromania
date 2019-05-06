package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Vo.concertVo;
import Vo.stadiumVo;

public class concertDao {
	public void insert(concertVo concertvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(concertvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List search(concertVo concertvo)
	{
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From concertVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void delete(concertVo concertvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(concertvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List edit(concertVo concertvo)
	{
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From concertVo where id='"+concertvo.getCn_id()+"'");
			query.list();
			ls=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void update(concertVo concertvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(concertvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List loadstadium(stadiumVo stadiumvo)
	{
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From stadiumVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	public List loadconcert(concertVo concertvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From concertVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
}
