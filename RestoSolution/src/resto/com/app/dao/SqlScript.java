package resto.com.app.dao;

public class SqlScript {
public static String loginValidation = "select login_id ,password ,status from user where password = :password and login_id = :username";
}
