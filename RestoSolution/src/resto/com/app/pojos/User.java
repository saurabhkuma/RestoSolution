package resto.com.app.pojos;


import java.util.Date;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class User {
	
	 
	@Column(name="login_id") 
	private String login_id;
	
	 @Column(name="emp_id")
	private String emp_id;
	
	 @Column(name="password")
	private String password;
	
	@Column(name="status")
	private String status;
	
	 @Column(name="login_exp_date")
	 @org.springframework.format.annotation.DateTimeFormat(pattern = "MM-dd-yyyy")
	private String loginexpirydate;

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	

	public String getLoginexpirydate() {
		return loginexpirydate;
	}

	public void setLoginexpirydate(String loginexpirydate) {
		this.loginexpirydate = loginexpirydate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
