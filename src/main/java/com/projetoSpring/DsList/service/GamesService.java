package com.projetoSpring.DsList.service;

import com.projetoSpring.DsList.dto.GameDto;
import com.projetoSpring.DsList.dto.GameMinDto;
import com.projetoSpring.DsList.model.Games;
import com.projetoSpring.DsList.projection.GamesMinProjection;
import com.projetoSpring.DsList.repository.GamesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRespository gamesRespository;

  @Transactional(readOnly = true)
    public GameDto findByid(Long id){
        Games games = gamesRespository.findById(id).get();
        return new GameDto(games);
       // GameDto dto  = new GameDto(games);
       // return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<Games> all = gamesRespository.findAll();
        // List<GameMinDto>all.stream().map(x -> new GameMinDto(x)).toList();
        return all.stream().map(x -> new GameMinDto(x)).toList();

    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAlList(Long listId){
        List<GamesMinProjection> all = gamesRespository.searchByList(listId);
        // List<GameMinDto>all.stream().map(x -> new GameMinDto(x)).toList();
        return all.stream().map(x -> new GameMinDto(x)).toList();

    }
}


