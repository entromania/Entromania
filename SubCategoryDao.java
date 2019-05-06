package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.CategoryVo;
import Vo.SubCategoryVo;

public class SubCategoryDao {

	public List loadCategory(CategoryVo categoryVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("From CategoryVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void addSubcategory(SubCategoryVo subcategoryVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(subcategoryVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List viewSubcategory(SubCategoryVo subCategoryVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("From SubCategoryVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void deleteSubCategory(SubCategoryVo subCategoryVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(subCategoryVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List editSubCategory(SubCategoryVo subCategoryVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From SubCategoryVo where id='"+subCategoryVo.getSubcategoryId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void updateSubCategory(SubCategoryVo subCategoryVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(subCategoryVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
