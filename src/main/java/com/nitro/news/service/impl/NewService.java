package com.nitro.news.service.impl;

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
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
		NewsEntity newsEntity = newsConverter.toEntity(newsDTO);
		newsEntity.setCategory(categoryEntity);
		newsEntity = newsRepository.save(newsEntity);
		return newsConverter.toDTO(newsEntity);
	}
}
