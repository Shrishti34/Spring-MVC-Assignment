package ValidationAPI;

import javax.enterprise.inject.Model;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerController {

	@RequestMapping("/hello")
	 public String display(Model m)  
    {  
		m.addAttribute("cust", new Customer());  
        return "viewpage";  
    }  
    @RequestMapping("/helloagain")  
    public String submitForm(@Valid @ModelAttribute("cust") Customer c, BindingResult br)  
    {  
        if(br.hasErrors())  
        {  
            return "viewpage";  
        }  
        else  
        {  
        return "final";  
        }  
    }  
}  

