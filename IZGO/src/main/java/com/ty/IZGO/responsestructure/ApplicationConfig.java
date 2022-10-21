package com.ty.IZGO.responsestructure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ApplicationConfig {

	public Docket getDocket() {
		Contact contact = new Contact("testyantra", "www.testyantra.com", "testyantra@mail.com");
		@SuppressWarnings("rawtypes")
		List<VendorExtension> extensions = new ArrayList<VendorExtension>();

		ApiInfo apiInfo = new ApiInfo("Hospital App", "This App is to  food at store", "1.0", "www.testyantra.com",
				contact, "Apache-Tomcat-9.0", "www.testyantra.global.com", extensions);
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ty.foodappapi")).build().apiInfo(apiInfo)
				.useDefaultResponseMessages(false);

	}

}