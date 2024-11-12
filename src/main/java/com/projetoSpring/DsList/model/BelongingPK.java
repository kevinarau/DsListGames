package com.projetoSpring.DsList.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.NavigableMap;
import java.util.Objects;
@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "game_id")
     private Games games;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;



    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(games, that.games) && Objects.equals(gameList, that.gameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(games, gameList);
    }
}
