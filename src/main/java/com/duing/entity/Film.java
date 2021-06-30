package com.duing.entity;

import java.io.Serializable;
import java.util.Date;

public class Film implements Serializable {

    private static final long serialVersionUID = 4787217166411680724L;

    private Long id;
    private String film_id;
    private String film_name;
    private String film_director;
    private String film_player;
    private String film_type;
    private String film_country;
    private Integer film_length;
    private String film_synopsis;
    private Date film_play_time;
    private String film_img_path;

    public Film() {}

    public Film(Long id, String film_id, String film_name, String file_director, String film_player, String film_type, String film_country, Integer film_length, String film_synopsis, Date film_play_time, String film_img_path) {
        this.id = id;
        this.film_id = film_id;
        this.film_name = film_name;
        this.film_director = file_director;
        this.film_player = film_player;
        this.film_type = film_type;
        this.film_country = film_country;
        this.film_length = film_length;
        this.film_synopsis = film_synopsis;
        this.film_play_time = film_play_time;
        this.film_img_path = film_img_path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getFilm_director() {
        return film_director;
    }

    public void setFilm_director(String file_director) {
        this.film_director = file_director;
    }

    public String getFilm_player() {
        return film_player;
    }

    public void setFilm_player(String film_player) {
        this.film_player = film_player;
    }

    public String getFilm_type() {
        return film_type;
    }

    public void setFilm_type(String film_type) {
        this.film_type = film_type;
    }

    public String getFilm_country() {
        return film_country;
    }

    public void setFilm_country(String film_country) {
        this.film_country = film_country;
    }

    public Integer getFilm_length() {
        return film_length;
    }

    public void setFilm_length(Integer film_length) {
        this.film_length = film_length;
    }

    public String getFilm_synopsis() {
        return film_synopsis;
    }

    public void setFilm_synopsis(String film_synopsis) {
        this.film_synopsis = film_synopsis;
    }

    public Date getFilm_play_time() {
        return film_play_time;
    }

    public void setFilm_play_time(Date film_play_time) {
        this.film_play_time = film_play_time;
    }

    public String getFilm_img_path() {
        return film_img_path;
    }

    public void setFilm_img_path(String film_img_path) {
        this.film_img_path = film_img_path;
    }
}
