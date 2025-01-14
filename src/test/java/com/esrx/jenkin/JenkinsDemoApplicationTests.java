package com.esrx.jenkin;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class JenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		logger.info(" second Test case executing...");
		assertEquals(true, true);
	}

}
