package com.projetoSpring.DsList.controller;

import com.projetoSpring.DsList.dto.GameDto;
import com.projetoSpring.DsList.dto.GameMinDto;
import com.projetoSpring.DsList.model.Games;
import com.projetoSpring.DsList.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;


    @GetMapping("/{id}")
    public GameDto findAll(@PathVariable Long id){
         return gamesService.findByid(id);
    }

    @GetMapping
    public List<GameMinDto> findAll(){
        return gamesService.findAll();
    }

}
