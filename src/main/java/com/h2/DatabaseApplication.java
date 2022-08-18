package com.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
		
		Student s1=new Student();
		s1.setAge(21);
		s1.setLname("sam");
		s1.setFname("pink");
		s1.setGender("male");
		
		System.out.println("the fullname ="+s1.getFname()+s1.getLname());
	}

}
