package com.KP.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class DemoWorkshopApplicationTests {

	@Test
	void contextLoads() {
		List<String> li = new ArrayList<>();
		li.add("example");
		System.out.println(li);
	}

}
