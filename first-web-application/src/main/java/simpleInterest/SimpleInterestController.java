package simpleInterest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/simpleinterest")
public class SimpleInterestController {
	
	@RequestMapping(value = "/simpleinterest")
	@ResponseBody
	public double interest(@RequestParam("newfield") int Principle, int Years, int Rate) {
		double view = (Principle*Years*Rate)/100;
		return view;
	}

}
