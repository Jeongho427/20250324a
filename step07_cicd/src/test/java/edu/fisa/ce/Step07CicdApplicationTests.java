package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Step07CicdApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test  // JUnit 4
    // @org.junit.jupiter.api.Test // JUnit 5
    public void testAddition() {
        int result = 2 + 3;
        System.out.println("비교 전*****************");
        assertEquals(5, result);  // 성공: 5 == 5
        System.out.println("비교 후*****************");
    }

}
