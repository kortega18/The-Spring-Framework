package com.kassandraortega.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans? => Find using the @Component
	// What are the dependencies of a bean? => Find using @Autowired
	// Where to search for beans? => No need because we are in the same package.
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		//System.out.println(result);
		
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {124, 4, 6}, 3);
		System.out.println(result);
		
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
