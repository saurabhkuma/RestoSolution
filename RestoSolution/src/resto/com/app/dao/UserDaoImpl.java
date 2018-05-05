package resto.com.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import resto.com.app.pojos.User;

@Repository
public class UserDaoImpl implements UserDao{

	 @Autowired
	  private SessionFactory factory;
	  
	
	@Override
	public User getUser(String username, String password) {
		// TODO Auto-generated method stub
		// get the current hibernate session
		   Session session = factory.getCurrentSession();
		  User user = null;
		// create a query to select all orders
		  Query theQuery = session.createQuery("select login_id ,password ,status from user where password = :password and login_id = :username");
		  
		  List<User> listuser = theQuery.setString("password", password).setString("username", username).list();
		  
		  if(!listuser.isEmpty())
			user = listuser.get(0);
		  
		  // return the result
		    return user;
	}
	
	

}
