package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Utility.HibernateUtil;
import model.User;

public class UserDAO {
SessionFactory sessionfactory=HibernateUtil.getSessionFactory();	  
	      public void addUser(User user) {
	      Transaction transaction = null;
		  try(Session session = sessionfactory.openSession()){
	            transaction = session.beginTransaction();
	            session.save(user);
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) 
	            	transaction.rollback();
	            e.printStackTrace();
	        }
	    }

	public List<User> getAllUsers() {
	        try (Session session = sessionfactory.openSession()) {
	            return (List<User>)session.createQuery("form User").list();
	       
	       } catch (Exception e) {
	    	   e.printStackTrace();
	         }
	        return null;  
	    }

}
