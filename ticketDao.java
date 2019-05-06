package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.concertVo;
import Vo.matchVo;
import Vo.stadiumVo;
import Vo.ticketVo;

public class ticketDao {

	public List loadmatch(matchVo matchvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From matchVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public List loadstadium(stadiumVo stadiumvo) {
		List ls1= null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From stadiumVo");
			query.list();
			ls1=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls1;
	}

	public void insert(ticketVo ticketvo) {
		
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(ticketvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List viewticket(ticketVo ticketvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("From ticketVo");
			query.list();
			ls=query.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	
	
	
	public void deleteticket(ticketVo ticketvo) {
		
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(ticketvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List editticket(ticketVo ticketvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("From ticketVo where id='"+ticketvo.getTicketId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
	
	public List editticket1(ticketVo ticketvo) {
		List ls2=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("From ticketVo where matchId='"+ticketvo.getMatchvo().getM_id()+"' and ticketname='"+ticketvo.getTicketname()+"'");
			Query q = session.createQuery("From ticketVo where matchId='"+ticketvo.getMatchvo().getM_id()+"' and ticketname='"+ticketvo.getTicketname()+"'");
			q.list();
			ls2=q.list();
			System.out.println("---++++++---"+ls2.size());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls2;
	}
	
	public void updateticket(ticketVo ticketvo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("sold---"+ticketvo.getSoldTickets());
			session.saveOrUpdate(ticketvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List viewSpecificTicket(matchVo matchvo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			System.out.println("matchVo id :: "+matchvo.getM_id());

			Query query = session.createQuery("from ticketVo as t where t.matchvo="+matchvo.getM_id());
			query.list();
			ls=query.list();
			
			System.out.println("ticket list size :: "+ls.size());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	


}
