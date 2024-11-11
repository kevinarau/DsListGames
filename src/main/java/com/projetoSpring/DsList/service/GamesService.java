package com.projetoSpring.DsList.service;

import com.projetoSpring.DsList.dto.GameMinDto;
import com.projetoSpring.DsList.model.Games;
import com.projetoSpring.DsList.repository.GamesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRespository gamesRespository;


    public List<GameMinDto> findAll(){
        List<Games> all = gamesRespository.findAll();
        // = all.stream().map(x -> new GameMinDto(x)).toList();
        return all.stream().map(x -> new GameMinDto(x)).toList();

    }
}

