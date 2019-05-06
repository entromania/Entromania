package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.cityVo;
import Vo.employeeVo;
import Vo.stadiumVo;
import Vo.stateVo;

public class employeeDao {
	public void insert(employeeVo employeevo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(employeevo);
			tr.commit();
		}
		catch(Exception p)
		{
			p.printStackTrace();
		}
	}
	public List search(employeeVo employeeVo)
	{	
		List ls = null;
		try
		{
			SessionFactory sessFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessFactory.openSession();
			Query query = session.createQuery("From employeeVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void delete(employeeVo employeevo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(employeevo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List edit(employeeVo employeevo)
	{	List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("From employeeVo where id='"+employeevo.getE_id()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void update(employeeVo employeevo)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(employeevo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public List loadstate(stateVo statevo){
		List ls=null;
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
	public List loadcity (cityVo cityvo){
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
	public List loadstadium(stadiumVo stadiumvo){
		List lst=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("From stadiumVo");
			query.list();
			lst=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return lst;
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
	public List loadStadium(cityVo  cityvo) {
		List list = new ArrayList();
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

			Session session = sessionFactory.openSession();

			Query query = session.createQuery("from stadiumVo where cityId='"+cityvo.getC_id()+"'");
			
			list = query.list();

		} catch (Exception exception) {

			exception.printStackTrace();

		}
		return list;
	}

}