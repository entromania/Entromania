package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.complainVo;

public class complainDao {

	public void insert(complainVo complainVo) {
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(complainVo);
			tr.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public List viewComplain(complainVo complainVo) {
		List ls = null;
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From complainVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}

	public List edit(complainVo complainVo) {
		List ls = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From complainVo where id='"+complainVo.getComplainId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

}
