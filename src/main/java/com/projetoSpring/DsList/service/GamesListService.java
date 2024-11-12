package com.projetoSpring.DsList.service;

import com.projetoSpring.DsList.dto.GameDto;
import com.projetoSpring.DsList.dto.GameListDto;
import com.projetoSpring.DsList.dto.GameMinDto;
import com.projetoSpring.DsList.model.GameList;
import com.projetoSpring.DsList.model.Games;
import com.projetoSpring.DsList.repository.GamesListRespository;
import com.projetoSpring.DsList.repository.GamesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesListService {

    @Autowired
    private GamesListRespository gamesListRespository;



    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList> all = gamesListRespository.findAll();
        // List<GameMinDto>all.stream().map(x -> new GameMinDto(x)).toList();
        return all.stream().map(g -> new GameListDto(g)).toList();

    }
}


