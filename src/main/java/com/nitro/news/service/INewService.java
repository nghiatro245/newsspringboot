package com.nitro.news.service;

import com.nitro.news.dto.NewsDTO;

public interface INewService {
	NewsDTO save(NewsDTO newsDTO);
	// NewsDTO update(NewsDTO newsDTO);
	void delete(long[] ids);
}
