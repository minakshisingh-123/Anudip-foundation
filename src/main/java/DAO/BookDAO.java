package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Utility.HibernateUtil;
import model.Book;

public class BookDAO {
SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
	public void addBook(Book book) {
		Transaction transaction = null;
		try (Session session =sessionfactory.openSession()) {
			transaction = session.beginTransaction();
			session.save(book);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}

	public List<Book> getAllBooks(){
		try (Session session =sessionfactory.openSession()) {
			return (List<Book>)session.createQuery("From Book").list();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	  return null;
	        
  }
}
