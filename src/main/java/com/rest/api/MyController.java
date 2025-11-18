package com.rest.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MyController {
   
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/")
	public String load(ModelMap map) {
		Map<String,List<Map<String,Object>>> data =restTemplate.getForObject("https://dummyjson.com/products", Map.class);
		List<Map<String,Object>> products= data.get("products");
		map.put("products", products);
		return "Product.html";
	}
}
