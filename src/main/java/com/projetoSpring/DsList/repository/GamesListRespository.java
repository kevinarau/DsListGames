package com.projetoSpring.DsList.repository;

import com.projetoSpring.DsList.model.GameList;
import com.projetoSpring.DsList.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GamesListRespository extends JpaRepository<GameList,Long> {
}
