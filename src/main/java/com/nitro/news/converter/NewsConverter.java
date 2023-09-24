package com.nitro.news.converter;

import org.springframework.stereotype.Component;

import com.nitro.news.dto.NewsDTO;
import com.nitro.news.entity.CategoryEntity;
import com.nitro.news.entity.NewsEntity;

@Component
public class NewsConverter {
	public NewsEntity toEntity(NewsDTO dto) {
		NewsEntity entity = new NewsEntity();
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumnail(dto.getThumnail());
		return entity;
	}
	
	public NewsDTO toDTO(NewsEntity entity) {
		NewsDTO dto = new NewsDTO();
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setThumnail(entity.getThumnail());
		return dto;
	}
}
