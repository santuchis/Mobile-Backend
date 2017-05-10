package mobile.app.standalone;

import mobile.app.controller.impl.RestServiceImpl;

import org.springframework.boot.SpringApplication;

public class StandaloneApp {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RestServiceImpl.class, args);
	}
}
