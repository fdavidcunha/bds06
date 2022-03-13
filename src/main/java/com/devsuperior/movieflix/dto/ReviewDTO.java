package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import com.devsuperior.movieflix.entities.User;

public class ReviewDTO  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long movieId;
	private String text;
	private User user;
	
	public ReviewDTO() {
		
	}
	
	public ReviewDTO(Long id, String text, Long movieId, User user) {
		super();
		this.id = id;
		this.text = text;
		this.movieId = movieId;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
