package com.nitro.news.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nitro.news.dto.NewsDTO;
import com.nitro.news.service.INewService;


//@Controller
@RestController
public class NewsAPI {
//	@RequestMapping(value="/news", method=RequestMethod.POST);
//	@ResponseBody
//	
	
//	@GetMapping("/test")
//	public String tesAPI() {
//		return "knan";
//	}
	
	@Autowired
	private INewService iNewService;
	
	@PostMapping(value = "/new")
	public NewsDTO createNew(@RequestBody NewsDTO model) {
		return model;
	}
	
	@PutMapping("/new")
	public NewsDTO updateNew(@RequestBody NewsDTO model) {
		return model;
	}
	
	@DeleteMapping(value = "/new")
	public void deleteNew(@RequestBody long[] ids) {
		
	}
}
