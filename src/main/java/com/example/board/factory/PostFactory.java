package com.example.board.factory;

import java.util.Date;
import java.util.UUID;

import com.example.board.entity.Post;

public class PostFactory {
	private PostFactory() {
	}

	public static Post newPost() {
		Post post = new Post();
		return post;
	}

	public static Post createPost(Post post) {
		String id = UUID.randomUUID().toString();
		post.setId(id);
		;
		Date current = new Date();
		post.setCreatedDate(current);
		post.setUpdatedDate(current);
		return post;
	}

	public static Post deletePost(Post post) {
		post.setDeleted(true);
		Date current = new Date();
		post.setUpdatedDate(current);
		return post;
	}
}
