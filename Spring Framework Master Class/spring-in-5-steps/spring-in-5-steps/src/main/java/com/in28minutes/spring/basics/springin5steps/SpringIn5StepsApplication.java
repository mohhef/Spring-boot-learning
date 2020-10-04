package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		BinarySearchImpl bn = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = bn.binarySearch(new int[]{12,3,2},3);
		System.out.println(result);
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
