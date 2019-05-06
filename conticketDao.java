package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.concertVo;
import Vo.conticketVo;
import Vo.stadiumVo;

public class conticketDao {

	public List loadstadium(stadiumVo stadiumvo) {
		List ls = null;
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


	/*public List viewconcertTicket(concertVo concertvo) {
		List ls1 = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			System.out.println("concertVo id :: "+concertvo.getCn_id());

			Query query = session.createQuery("from conticketVo as t where t.concertvo="+concertvo.getCn_id());
			query.list();
			ls1=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls1;
	}*/
	
	public List loadconcert(concertVo concertvo) {
		List ls1 = null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From concertVo");
			query.list();
			ls1=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls1;
	}

	public void insert(conticketVo conticketvo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(conticketvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public List viewticket(conticketVo conticketvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From conticketVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void delete(conticketVo conticketvo) {
	
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(conticketvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List editticket(conticketVo conticketvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("From conticketVo where id='"+conticketvo.getC_ticketId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void update(conticketVo conticketvo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(conticketvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}


	public List viewconcertTicket(concertVo concertvo) {
		List ls1=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			System.out.println("concertVo id :: "+concertvo.getCn_id());

			Query query = session.createQuery("from conticketVo as t where t.concertvo="+concertvo.getCn_id());
			query.list();
			ls1=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls1;
	}


	

}
