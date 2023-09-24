package com.nitro.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitro.news.entity.NewsEntity;

public interface NewsRepository extends JpaRepository<NewsEntity, Long>{

}
