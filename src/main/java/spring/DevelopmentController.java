package spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/development")
public class Controller {
    @RequestMapping(value = "/values", method = RequestMethod.POST, produces = { "application/v1+json" })
    public @ResponseBody
    String filterRDF(
            @RequestParam(value = "entity[]", defaultValue = "Barack_Obama") String[] entity,
            @RequestParam(value = "property[]", defaultValue = "surname;prefix") String property
    ) {

        return "Foobar";
    }
}
