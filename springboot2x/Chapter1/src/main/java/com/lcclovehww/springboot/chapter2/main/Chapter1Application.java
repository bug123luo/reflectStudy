package com.lcclovehww.springboot.chapter2.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@EnableAutoConfiguration
public class Chapter1Application {

	@RequestMapping("/test")
	@ResponseBody
	public Map<String, String> test(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "value");
		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}
	
	public static void strToJson() {
		JSONObject testjson = new JSONObject();
		JSONObject testjson2 = new JSONObject();
		JSONObject testjson3 = new JSONObject();
		JSONObject testjson4 = new JSONObject();
		JSONArray testjson5 = new JSONArray();
		JSONObject testjson6 = new JSONObject();
		JSONObject testjson7 = new JSONObject();

		testjson.put("version", "001");
		testjson.put("msgType", "warn");
		testjson.put("msgSerial", "46545654564654");
		testjson.put("msgSendTime", "20190102565689");
		testjson.put("msgBody", testjson2);
		testjson2.put("baseStation", testjson3);
		testjson3.put("serial", "909890");
		testjson3.put("repeater", testjson4);
		testjson4.put("devices", testjson5);
		testjson4.put("id","123213132");
		testjson5.add(testjson6);
		testjson5.add(testjson7);
		testjson6.put("number", "89798809809");
		testjson6.put("warn", "");
		System.out.println(testjson.toJSONString());
		String msg=testjson.toString();
		System.out.println(msg);
		//IotJsonMsg iotJsonMsg = IotStringToClass.changeToIotMsg(msg);
		
	}
}
