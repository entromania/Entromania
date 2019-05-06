package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.attachmentVo;
import Vo.bookticketVo;
import Vo.bookticketdetailVo;

public class attachmentDao {

	public void insert(attachmentVo attachmentVo) {
	
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(attachmentVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	
	public List search() {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From bookticketVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	
}
