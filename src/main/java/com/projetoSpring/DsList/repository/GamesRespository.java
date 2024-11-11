package com.projetoSpring.DsList.repository;

import com.projetoSpring.DsList.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRespository extends JpaRepository<Games,Long> {
}
