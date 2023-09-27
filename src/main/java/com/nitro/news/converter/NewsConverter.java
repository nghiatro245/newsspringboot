package com.nitro.news.converter;

import java.util.Optional;

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
		if(entity.getId()!=null) {
			dto.setId(entity.getId());
		}
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setThumnail(entity.getThumnail());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		return dto;
	}
	
	public NewsEntity toEntity(NewsDTO dto, Optional<NewsEntity> entity) {
		entity.get().setTitle(dto.getTitle());
		entity.get().setContent(dto.getContent());
		entity.get().setShortDescription(dto.getShortDescription());
		entity.get().setThumnail(dto.getThumnail());
		return entity.get();
	}
	
}
