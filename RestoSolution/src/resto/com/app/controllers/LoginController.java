package resto.com.app.controllers;

import java.util.List;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import resto.com.app.pojos.Login;
import resto.com.app.pojos.User;
import resto.com.app.services.LoginService; 


@Controller
@RequestMapping("/login")
public class LoginController {

	
	 @Autowired
	  private LoginService loginService;
	  
	  
	 
	  @GetMapping("/restologin")
	  public ModelAndView loginProcess(Model model,
			  @ModelAttribute("login") Login login) {
		  
		  ModelAndView mav = null; 
		// get orders from dao
		  User user = loginService.loginToUser(login.getUsername(), login.getPassword());
		  
		  // add the orders to the model
		  model.addAttribute("user", user);
		  
		  if(user != null)
			 mav =  new ModelAndView("welcome");
		  else
			  mav =  new ModelAndView("login");
		  
		  return mav;
		  
	  /* ... */ }
}
