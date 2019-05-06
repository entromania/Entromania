package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.CategoryVo;
import Vo.ProductVo;
import Vo.SubCategoryVo;

public class ProductDao {

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

	public List loadSubCategory(SubCategoryVo subCategoryVo) {
		List ls1=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query query = session.createQuery("From SubCategoryVo");
			query.list();
			ls1=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls1;
	}

	public void addProduct(ProductVo productVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(productVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List viewProduct(ProductVo productVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From ProductVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void deleteProduct(ProductVo productVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(productVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List editProduct(ProductVo productVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From ProductVo where id='"+productVo.getProductId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void updateProduct(ProductVo productVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(productVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List addtoCart(ProductVo productVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From ProductVo where id='"+productVo.getProductId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

}
