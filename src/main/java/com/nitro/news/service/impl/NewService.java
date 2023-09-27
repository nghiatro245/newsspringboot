package com.nitro.news.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitro.news.converter.NewsConverter;
import com.nitro.news.dto.NewsDTO;
import com.nitro.news.entity.CategoryEntity;
import com.nitro.news.entity.NewsEntity;
import com.nitro.news.repository.CategoryRepository;
import com.nitro.news.repository.NewsRepository;
import com.nitro.news.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private NewsRepository newsRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private NewsConverter newsConverter;

	@Override
	public NewsDTO save(NewsDTO newsDTO) {
		NewsEntity newsEntity = new NewsEntity();
		if(newsDTO.getId()!=null) {
			Optional<NewsEntity> oldNewsEntity = newsRepository.findById(newsDTO.getId());
			newsEntity = newsConverter.toEntity(newsDTO, oldNewsEntity);
		}else {
			newsEntity = newsConverter.toEntity(newsDTO);
		} 
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());		
		newsEntity.setCategory(categoryEntity);
		newsEntity = newsRepository.save(newsEntity);
		return newsConverter.toDTO(newsEntity);
	}

//	@Override
////	public NewsDTO update(NewsDTO newsDTO) {
////		NewsEntity oldNewsEntity = newsRepository.findById(newsDTO.getId());
////		NewsEntity newsEntity = newsConverter.toEntity(newsDTO, oldNewsEntity);
////		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
////		newsEntity.setCategory(categoryEntity);
////		newsEntity = newsRepository.save(newsEntity);
////		return newsConverter.toDTO(newsEntity);
////	}
}
