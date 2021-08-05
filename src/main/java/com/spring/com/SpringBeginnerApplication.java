package com.spring.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeginnerApplication {

	public static void main(String[] args) {
		
		BinarySearch bin = new BinarySearch();
		int result = bin.BinSearch(new int[] {1,2,3}, 3);
		System.out.println(result);
		SpringApplication.run(SpringBeginnerApplication.class, args);
	}

}
