package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.bookticketVo;
import Vo.bookticketdetailVo;
import Vo.matchVo;

public class bookticketDao {

	public void insert(bookticketVo bookticketvo) {
	
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(bookticketvo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void insertdetails(bookticketdetailVo bookticketdetailVo) {
		
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(bookticketdetailVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
	}
	public List search(bookticketVo bookticketvo) {
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
	public int searchcounterforType(bookticketdetailVo bookticketdetailVo) {
		List<bookticketdetailVo> ls=null;
		int counter=0;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("From bookticketdetailVo where ticketname='"+bookticketdetailVo.getTicketname()+"' and matchVo='"+bookticketdetailVo.getMatchVo().getM_id()+"'  order by ticketdetailid desc limit 1");
			Query q = session.createQuery("From bookticketdetailVo where ticketname='"+bookticketdetailVo.getTicketname()+"' and matchId='"+bookticketdetailVo.getMatchVo().getM_id()+"'  order by ticketdetailid desc limit 1");
			q.list();
			ls=q.list();
			if(ls.size()!=0)
			{
				counter=ls.get(0).getNoofticket();
				System.out.println("-------"+ls.get(0).getTicketname()+"-------"+ls.get(0).getTicketdetailid());
			}
			//System.out.println("----454545---"+counter);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return counter;
	}
	
	public List searchbooked(bookticketdetailVo bookticketdetailVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From bookticketdetailVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
		
	public List searchbookingdetails() {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From bookticketdetailVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}
}
