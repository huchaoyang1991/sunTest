package com.sun.api;

import com.sun.service.UserService;
import org.testng.annotations.Test;
import wind.test.base.BaseTestCase;

import javax.annotation.Resource;

/**
 * Created by huchaoyang on 2017/7/15.
 */
public class TestRun extends BaseTestCase {
	@Resource
	private UserService userService;

	@Test
	public void run() {
		userService.getUserInfo(1);
	}
}
