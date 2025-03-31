package com.protheolabs.share_api;

import org.springframework.boot.SpringApplication;

public class TestShareApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(ShareApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
