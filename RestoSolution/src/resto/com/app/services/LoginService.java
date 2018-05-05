package resto.com.app.services;


import java.util.List;
import resto.com.app.pojos.User; 

public interface LoginService {

	
	public User loginToUser(String username ,String password);
}
