package com.qingao.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.qingao.gittest")
public class App 
{
    public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
