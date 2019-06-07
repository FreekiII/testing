package hi_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getHelloPage() {
        return "Hi, baka-san";
    }
}