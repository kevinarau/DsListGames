package com.projetoSpring.DsList.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_games")
public class Games {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private String imaUrl;
    private String shortDrescriptions;
    private String longDrescriptios;

    public Games() {
    }

    public Games(String genre, Long id, String imaUrl, String longDrescriptios, String platforms, String shortDrescriptions, String title, Integer year) {
        this.genre = genre;
        this.id = id;
        this.imaUrl = imaUrl;
        this.longDrescriptios = longDrescriptios;
        this.platforms = platforms;
        this.shortDrescriptions = shortDrescriptions;
        this.title = title;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImaUrl() {
        return imaUrl;
    }

    public void setImaUrl(String imaUrl) {
        this.imaUrl = imaUrl;
    }

    public String getLongDrescriptios() {
        return longDrescriptios;
    }

    public void setLongDrescriptios(String longDrescriptios) {
        this.longDrescriptios = longDrescriptios;
    }

    public String getShortDrescriptions() {
        return shortDrescriptions;
    }

    public void setShortDrescriptions(String shortDrescriptions) {
        this.shortDrescriptions = shortDrescriptions;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return Objects.equals(id, games.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
