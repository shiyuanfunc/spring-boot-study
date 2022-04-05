package com.shiyuan.springboottest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author SHI YUAN
 * @DATE 2022/3/18 9:45 AM
 * @Version 1.0
 * @Desc
 */
@RestController
public class TestController {

	@RequestMapping(value = "/test")
	public String test(){
		return "ok";
	}
}
