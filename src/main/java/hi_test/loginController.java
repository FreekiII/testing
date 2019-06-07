package hi_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(@ModelAttribute(name = "loginForm") LoginModel loginModel, Model model) {
        String username = loginModel.getUsername();
        if (username.equals("Miza")) {
            model.addAttribute("invalidCredentials", true);
            return "login";
        } else {
            return "chat";
        }
    }
}