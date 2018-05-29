package com.suncorp.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is used to configure Swagger API to the application. *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Contact information details for swagger documentation
     */
    public static final Contact DEFAULT_CONTACT = new Contact("Ramana", "http://www.suncop.com.au/",
            "hemasundara_kapaka@infosys.com");

    /**
     * API information details for swagger documentation
     */
    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("SunCorp API", "SunCorp API reference for consumers", "1.0",
            "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");

    /**
     * Produces and Consumes details for swagger configuration
     */
    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(
            Arrays.asList("application/json"));

    /**
     * Bean method for swagger configurations
     * @return
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
}