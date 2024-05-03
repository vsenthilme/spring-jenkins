package com.mnrclara.wrapper.core.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	private ApiKey apiKey() { 
//	    return new ApiKey("JWT", "Authorization", "header"); 	
//	}
//	
//	private SecurityContext securityContext() { 
//	    return SecurityContext.builder().securityReferences(defaultAuth()).build(); 
//	} 
//
//	private List<SecurityReference> defaultAuth() { 
//	    AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything"); 
//	    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1]; 
//	    authorizationScopes[0] = authorizationScope; 
//	    return Arrays.asList(new SecurityReference("JWT", authorizationScopes)); 
//	}
//	
	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	      .apiInfo(apiInfo())
//	      .securityContexts(Arrays.asList(securityContext()))
//	      .securitySchemes(Arrays.asList(apiKey()))
	      .select()
//	      .apis(RequestHandlerSelectors.any())
//	      .paths(PathSelectors.any())
	      .apis(RequestHandlerSelectors.basePackage("com.mnrclara.wrapper.core.controller"))
//	      .paths(PathSelectors.ant("/user/*"))
	      .paths(PathSelectors.any())
	      .build();
	    
	}

	private ApiInfo apiInfo() {
	    return new ApiInfo (
	      "M&R Clara API Services",
	      "M&R Clara Service API",
	      "1.0",
	      "Terms of service",
	      new Contact("M&R Clara", "www.mnrclara.com", "admin@mnrclara.com"),
	      "License of API",
	      "API license URL",
	      Collections.emptyList());
	}
}
