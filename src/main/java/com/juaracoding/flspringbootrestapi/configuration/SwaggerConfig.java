package com.juaracoding.flspringbootrestapi.configuration;
/*
IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Asus a.k.a. Fauziah Latifah
Java Developer
Created on 8/4/2023 7:58 PM
@Last Modified 8/4/2023 7:58 PM
Version 1.0
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).
                select().
                apis(RequestHandlerSelectors.basePackage("com.juaracoding.pcmspringbootrestapi.controller")).
                paths(PathSelectors.any()).build()
                .apiInfo(apiInfo());

    }

    //    ApiInfo(String title,
//    String description,
//    String version,
//    String termsOfServiceUrl,
//    String contactName,
//    String license,
//    String licenseUrl) {
    private ApiInfo apiInfo()
    {
        ApiInfo apiInfo = new ApiInfo(
                "Springboot+JPA+SQLServer",//title
                "Springboot bootcamp Juaracoding ",//descriptions
                "v1.0",//version
                "Term Of Services URL is On Progress",//termsOfServiceUrl
                new Contact("Paul Christian","localhost:8080","poll.chihuy@gmail.com"),//Contact Name
                "Springboot Open Source License",//license
                "https://spring.io/",//licenseUrl
                Collections.emptyList()
        );
        return apiInfo;
    }

}
