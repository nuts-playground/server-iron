package com.iron.gift.service;

import com.iron.gift.repository.PostRepository;
import com.iron.gift.request.PostCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	public void write(PostCreate postCreate) {
		postRepository.save(postCreate.toEntity());

	}

}