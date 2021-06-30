package com.duing.controller;

import com.duing.entity.Film;
import com.duing.service.FilmService;
import com.duing.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("客户端请求了Home首页");
        List<FilmVo> allFilmVoList = service.getAllFilmView();
        model.addAttribute("allFilmVoList", allFilmVoList);
        return "home";
    }


}
