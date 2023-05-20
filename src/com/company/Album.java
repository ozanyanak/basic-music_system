package com.company;

import java.util.List;

public class Album {
    private String name;
    private Musician artist;
    private List<String> songs;
    private int followers;
    private int likes;

    // Getters and setters for the properties
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Musician getArtist() {
        return artist;
    }
    public void setArtist(Musician artist) {
        this.artist = artist;
    }
    public List<String> getSongs() {
        return songs;
    }
    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
    public int getFollowers() {
        return followers;
    }
    public void setFollowers(int followers) {
        this.followers = followers;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
}
