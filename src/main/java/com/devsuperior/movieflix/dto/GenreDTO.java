package com.devsuperior.movieflix.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;

public class GenreDTO  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private List<Movie> movies = new ArrayList<>();

	public GenreDTO() {
		
	}

	public GenreDTO(Long id, String name, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
	}

	public GenreDTO(Genre entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.movies = entity.getMovies();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	};
}
