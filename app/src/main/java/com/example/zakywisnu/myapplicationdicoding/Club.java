package com.example.zakywisnu.myapplicationdicoding;

public class Club {
    private int picture;
    private String name;
    private String from;
    private String league;
    private String photo;
    private String description;

    public Club(int picture, String name, String from, String league, String description, String photo){
        this.picture = picture;
        this.name = name;
        this.from = from;
        this.league = league;
        this.description = description;
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getPhoto() {
        return photo;}

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

//
    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
