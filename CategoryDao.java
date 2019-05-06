package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.CategoryVo;

public class CategoryDao {

	public void insertCategory(CategoryVo CategoryVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(CategoryVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List viewCategory(CategoryVo categoryVo) {
		List ls = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From CategoryVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void deleteCategory(CategoryVo categoryVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(categoryVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List editCategory(CategoryVo categoryVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From CategoryVo where id='"+categoryVo.getCategoryId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void updateCategory(CategoryVo categoryVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(categoryVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	

}
