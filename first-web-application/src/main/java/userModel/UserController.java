package userModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.UserValidationService;

@Controller
public class UserController {
	
	@RequestMapping(value = "/UserValid")
	@ResponseBody
	@ModelAttribute("UserValid")
	public String credentials(@RequestParam String Name, String Password) {
		
		UserValidationService service = new UserValidationService();
		
		boolean isUserValid = service.isUserValid(Name, Password);
		
		if(isUserValid) {
			return "WEB-INF/views/success.jsp";
		
		}else{
			return "WEB-INF/views/error.jsp";
		}	
		
	
	}

}
