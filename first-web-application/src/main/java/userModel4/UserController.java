package userModel4;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.UserValidationService;

@Controller
public class UserController {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public int saveName(UserModel u){  
		 String query="insert into user values(  
				    '"+e.getusername()+"','"+e.getpassword()+"','"+e.getemail()+"')";   
	    return jdbcTemplate.update(query);  
	}  
	
	@RequestMapping(value = "/UserValid")
	@ResponseBody
	@ModelAttribute("UserValid")
	public String credentials(@RequestParam String username,@RequestParam String password) {
		
		UserValidationService service = new UserValidationService();
		
		boolean isUserValid = service.isUserValid(username, password);
		
		if(isUserValid) {
			return "WEB-INF/views/success.jsp";
		
		}else{
			return "WEB-INF/views/error.jsp";
		}	
		
	
	}

}
