package hi_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "Hi, baka-san";
    }
}