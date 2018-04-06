package spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}