import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot {

    public static void main(String[] args) {

        /*
         * Put here your init config etc
         */

        SpringApplication.run(Boot.class, args);
    }


//    @Bean
//    public Docket newsApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("default")
//                .apiInfo(apiInfo())
//                .select()
//                .paths(regex("/rdfcf.*|/kgutil.*")).build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("Knowledge Graph API").
//                description("description")
//                .termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
//                .contact("Marvin Hofer")
//                .license("Apache License Version 2.0")
//                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
//                .version("1.0")
//                .build();
//    }
}
