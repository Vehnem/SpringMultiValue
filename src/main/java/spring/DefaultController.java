package spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @RequestMapping(value = "test", method = RequestMethod.GET ) // , produces = "application/json")
    public String test() {
        return "Greetings from Spring Boot!";
    }

}