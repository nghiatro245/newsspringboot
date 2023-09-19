package com.nitro.news.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nitro.news.dto.NewsDTO;


@Controller
@RestController
public class NewsAPI {
//	@RequestMapping(value="/news", method=RequestMethod.POST);
//	@ResponseBody
//	
//	public NewsDTO creatNews(@ResponseBody NewsDTO model) {
//		return model;
//	}
	
//	@PostMapping("/news")
//	
//	public NewsDTO createNews(@RequestBody NewsDTO model) {
//		return model;
//	}
	
	
	@GetMapping("/test")
	public String tesAPI() {
		return "knan";
	}
}
