package helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	
	@ResponseBody
	public String sayHello() {
		return "WEB-INF/views/helloWorld.jsp";

}
}
