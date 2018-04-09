package spring;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/development")
public class DevelopmentController {


    @Value("${some.key:one,two,three}")
    private String stringWithDefaultValue;

    @RequestMapping(value = "/values", method = RequestMethod.GET)
    public @ResponseBody
    String testMuliValue(

            @ApiParam( value = "which entities to use ... ? \n example: \"Barack_Obama\"" ) @RequestParam(value = "entity" )  String[] entity,
            @ApiParam( value = "which properties to use ... \n example: \"surname;prefix=foaf\"") @RequestParam(value = "property" ) String[] property
    ) {

        StringBuilder sb = new StringBuilder();
        sb.append("ENTITIES : ");
        sb.append(Arrays.asList(entity));
        sb.append("\n");
        sb.append("PROPERTIES : ");
        sb.append(Arrays.asList(property).toString());

        return sb.toString();
    }
}
