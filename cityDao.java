package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.cityVo;
import Vo.stateVo;

public class cityDao {
	
	public void insert(cityVo c)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(c);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List search(cityVo cityvo)
	{	List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From cityVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e)
		{
			
		}
		return ls;
	}
	public void delete(cityVo cityvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(cityvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List edit(cityVo cityvo)
	{	List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From cityVo where id='"+cityvo.getC_id()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void update(cityVo cityvo)
	{	
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(cityvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public List searchstate(stateVo statevo)
	{
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("From stateVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
}
