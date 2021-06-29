package com.duing.dao;

import com.duing.entity.Film;

import java.util.List;

public interface FilmDao {

    /**
     * //    查询全部的影片信息
     */
    List<Film> getAllFilm();

}
