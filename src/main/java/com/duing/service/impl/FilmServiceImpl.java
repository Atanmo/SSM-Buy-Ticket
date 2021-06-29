package com.duing.service.impl;

import com.duing.dao.FilmDao;
import com.duing.entity.Film;
import com.duing.service.FilmService;
import com.duing.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDao dao;

    @Override
    public List<FilmVo> getAllFilmView() {
        List<FilmVo> filmVos = new ArrayList<>();
//        处理业务逻辑 将这些影片展示的domain填慢展示
        List<Film> films = dao.getAllFilm();
        for (Film film : films){
            //遍历全部的影片 每次装满一个需要展示的对象 放入集合中
            FilmVo filmVo = new FilmVo();
            filmVo.setFilmId(film.getFilm_id());
            filmVo.setFilmName(film.getFilm_name());
            filmVo.setFilmDirector(film.getFile_director());
            filmVo.setFilmImgPath(film.getFilm_img_path());

            filmVos.add(filmVo);
        }
        return filmVos;
    }
}
