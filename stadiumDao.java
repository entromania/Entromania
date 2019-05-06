package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


import Vo.cityVo;
import Vo.stadiumVo;
import Vo.stateVo;

public class stadiumDao {
	public void insert(stadiumVo stadiumvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(stadiumvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List search(stadiumVo stadiumVo)
	{	List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From stadiumVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void delete(stadiumVo stadiumvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(stadiumvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List edit(stadiumVo stadiumvo)
	{	List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From stadiumVo where id='"+stadiumvo.getS_id()+"'");
			query.list();
			ls=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void update(stadiumVo stadiumvo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(stadiumvo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List loadstate(stateVo statevo)
	{	List ls = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("From stateVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	
	public List loadcity(cityVo cityvo)
	{
		List lc=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("From cityVo");
			query.list();
			lc=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return lc;
	}
	public List loadCity(stateVo  statevo) {
		List list = new ArrayList();
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

			Session session = sessionFactory.openSession();

			Query query = session.createQuery("from cityVo where stateId='"+statevo.getId()+"'");
			
			list = query.list();

		} catch (Exception exception) {

			exception.printStackTrace();

		}
		return list;
	}


}
