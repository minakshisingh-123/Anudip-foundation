package DAO;

import java.util.List;

import javax.transaction.SystemException;
import javax.transaction.Transaction;
import org.hibernate.Session;
import Utility.HibernateUtil;
import model.Book;
import model.Library;

public class LibraryDAO {
	public void addLibrary(Library lib) {
		Transaction transaction = null;
		try (Session sessionFactory = HibernateUtil.getSessionFactory().openSession()) {
			transaction = (Transaction) sessionFactory.beginTransaction();
			sessionFactory.save(lib);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				try {
					transaction.rollback();
				} catch (IllegalStateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SystemException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			e.printStackTrace();
		}
	}

	public List<Book> updateLibrary(Library lib) {
		try (Session sessionFactory = HibernateUtil.getSessionFactory().openSession()) {
			return sessionFactory.createQuery("from Book", Book.class).list();
		}

	}
}
