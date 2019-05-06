package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import Vo.HeroesVo;

public class HeroesDao {

	public void addHero(HeroesVo heroesVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(heroesVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public List viewHero(HeroesVo heroesVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From HeroesVo");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void deleteHero(HeroesVo heroesVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(heroesVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public List editHero(HeroesVo heroesVo) {
		List ls=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From HeroesVo where id='"+heroesVo.getHeroId()+"'");
			q.list();
			ls=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls;
	}

	public void updateHero(HeroesVo heroesVo) {
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(heroesVo);
			tr.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public List loadHeroes(HeroesVo heroesVo) {
		List ls1=null;
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("From HeroesVo");
			q.list();
			ls1=q.list();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return ls1;
	}
}
