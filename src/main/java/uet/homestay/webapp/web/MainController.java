package uet.homestay.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC Java Configuration Example");
        return "index";
    }
}
