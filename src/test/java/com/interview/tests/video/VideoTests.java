package com.interview.tests.video;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.intervidd.usermanagement.InterviddUserManagement;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = InterviddUserManagement.class)
@WebAppConfiguration
public class VideoTests {

	@Test
	public void contextLoads() {
	}

}
