package com.chen.action;

import java.util.HashMap;
import java.util.Map;

import org.nutz.mvc.annotation.At;

public class AuthModule {

	@At("chen")
	public Object test() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "jinpeng");
		map.put("age", 25);
		return map;
	}
}
