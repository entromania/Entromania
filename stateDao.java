package Dao;

import java.util.ArrayList;

import java.util.List;

import Vo.stateVo;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class stateDao {

	public void insert(stateVo v) {
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(v);
			tr.commit();
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	public List search(stateVo v)
	{	List ls = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From stateVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e)
		{
			
		}
		return ls;
	}
	public void delete(stateVo v1)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(v1);
			tr.commit();
		}
		catch(Exception e)
		{
			
		}
	}
	public List edit(stateVo v2)
	{	List ls = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("From stateVo where id='"+v2.getId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e)
		{
			
		}
		return ls;
	}
	public void update(stateVo v3)
	{	try
		{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(v3);
		tr.commit();
		}
		catch(Exception e)
		{
			
		}
	}

}
