package com.projetoSpring.DsList.dto;

import com.projetoSpring.DsList.model.GameList;

public class GameListDto {


    private Long id;
    private String name;

    public GameListDto() {
    }

    public GameListDto(GameList list) {
        this.id = list.getId(); ;
        this.name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
