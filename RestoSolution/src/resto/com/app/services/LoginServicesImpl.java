package resto.com.app.services;

import resto.com.app.dao.UserDao;

import resto.com.app.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServicesImpl implements LoginService {
 
	@Autowired
	private UserDao userDAO;
	
	@Override
	public User loginToUser(String username , String password) {
		// TODO Auto-generated method stub
		return userDAO.getUser(username, password);
	}

}
