package com.amara.workshopmongo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amara.workshopmongo.domain.Post;
import com.amara.workshopmongo.repository.PostRepository;
import com.amara.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
