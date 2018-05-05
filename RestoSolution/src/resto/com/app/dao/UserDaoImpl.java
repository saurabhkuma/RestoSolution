package resto.com.app.dao;

import java.util.Iterator;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import resto.com.app.pojos.User;

@EnableTransactionManagement @Transactional
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
		  Query theQuery = session.createQuery(SqlScript.loginValidation);
		  
		  List<Object> listuser = theQuery.setString("password", password).setString("username", username).list();
		  
		  if(!listuser.isEmpty()) {
		    user = new User();
			 Iterator itr = listuser.iterator();
			  while(itr.hasNext()){
			     Object[] obj = (Object[]) itr.next();
			     //now you have one array of Object for each row
			     String loginid = String.valueOf(obj[0]); // don't know the type of column CLIENT assuming String 
			     String password2 =  String.valueOf(obj[1]); //SERVICE assumed as int
			     String status =   String.valueOf(obj[2]); 
			     user.setLogin_id(loginid);
			     user.setStatus(status);
			     System.out.println("loginid"+loginid);
			     System.out.println("password2 "+password2);
			     System.out.println("status "+status);
			     //same way for all obj[2], obj[3], obj[4]
			  }
		  System.out.println(listuser.get(0));
		  
			//user = (resto.com.app.pojos.User)listuser.get(0);
		  
		  }
		  // return the result
		    return user;
	}
	
	

}
