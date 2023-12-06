package com.example.mergeconflict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mergeconflict.add.Addition;

@SpringBootApplication
public class MergeConflictApplication {

	public static void main(String[] args) {
		SpringApplication.run(MergeConflictApplication.class, args);
		Addition addition = new Addition();
		System.out.print("sum ="+addition.add(10.0, 20.0));
	}

}
