package com.example.mergeconflict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mergeconflict.add.Addition;

@SpringBootApplication
public class MergeConflictApplication {

	public static void main(String[] args) {
		SpringApplication.run(MergeConflictApplication.class, args);
		Addition addition = new Addition();
		Integer c=addition.add(10, 20);
		System.out.print("sum ="+c);
	}

}
