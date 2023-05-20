package com.company;

import java.util.List;

public class Song {

    private String name;
    private Musician artist;
    private int likes;
    private Album album;
    private List<String> usersWhoLiked;

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
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }
    public List<String> getUsersWhoLiked() {
        return usersWhoLiked;
    }
    public void setUsersWhoLiked(List<String> usersWhoLiked) {
        this.usersWhoLiked = usersWhoLiked;
    }

}
