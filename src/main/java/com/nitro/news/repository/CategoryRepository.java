package com.nitro.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitro.news.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
