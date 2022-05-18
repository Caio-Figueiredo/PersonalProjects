package com.restapi.RestAPI;

import com.restapi.RestAPI.Controllers.StatusContoller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
		StatusContoller check = new StatusContoller();

		System.out.print(check.getStatus());

	}

}
