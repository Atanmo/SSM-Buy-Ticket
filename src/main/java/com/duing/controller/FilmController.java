package com.duing.controller;

import com.duing.entity.Film;
import com.duing.service.FilmService;
import com.duing.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FilmController {

    @Autowired
    private FilmService service;

    @RequestMapping("/allFilm")
    @ResponseBody
    public List<FilmVo> allFilm(){
        return service.getAllFilmView();
    }


}
