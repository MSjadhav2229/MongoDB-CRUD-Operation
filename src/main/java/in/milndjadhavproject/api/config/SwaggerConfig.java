//package in.milndjadhavproject.api.config;
//
//
//import io.swagger.models.Contact;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.service.ApiInfo;
//
//import java.util.Collections;
//
///**
// *
// * @author Mandar Pandit
// */
//@Configuration
////@EnableSwagger2
//public class SwaggerConfig {
//
//    private ApiInfo apiInfo() {
//        return new ApiInfo("Blog REST APIs",
//                "REST APIs for Blog Application",
//                "1.0",
//                "Terms of service",
//                new Contact("Milind S. Jadhav", "www.javaguides.net", "milindjadhav2209@gmail.com"),
//                "License of API",
//                "API license URL",
//                Collections.emptyList());
//    }
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
//}
