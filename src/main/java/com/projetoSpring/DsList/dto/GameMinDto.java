package com.projetoSpring.DsList.dto;

import com.projetoSpring.DsList.model.Games;
import com.projetoSpring.DsList.projection.GamesMinProjection;
import jakarta.persistence.Column;
import org.springframework.stereotype.Service;

@Service
public class GameMinDto {

    private  Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Games games) {
        this.id = games.getId();
        this.imgUrl = games.getImgUrl();
        this.shortDescription = games.getShortDescriptions();
        this.title = games.getTitle();
        this.year = games.getYear();
    }
    public GameMinDto(GamesMinProjection projection) {
        this.id = projection.getId();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescriptions();
        this.title = projection.getTitle();
        this.year = projection.getGameYear();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
