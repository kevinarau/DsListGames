package com.projetoSpring.DsList.controller;

import com.projetoSpring.DsList.dto.GameDto;
import com.projetoSpring.DsList.dto.GameListDto;
import com.projetoSpring.DsList.dto.GameMinDto;
import com.projetoSpring.DsList.model.GameList;
import com.projetoSpring.DsList.repository.GamesListRespository;
import com.projetoSpring.DsList.service.GamesListService;
import com.projetoSpring.DsList.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GamesListService gamesListService;
    @Autowired
    private GamesService gamesService;


    @GetMapping
    public List<GameListDto> findAll(){
      List<GameListDto> all = gamesListService.findAll();
     return all;
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDto> findByList( @PathVariable Long listId){
        return gamesService.findAlList(listId);
    }


}
