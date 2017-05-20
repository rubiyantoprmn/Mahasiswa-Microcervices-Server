package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MahasiswaMicroservicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MahasiswaMicroservicesServerApplication.class, args);
	}
}
