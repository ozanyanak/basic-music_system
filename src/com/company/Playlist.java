package com.company;

import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;
    private String owner;
    private Song mostPlayed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public Song getMostPlayed() {
        return mostPlayed;
    }

    public void setMostPlayed(Song mostPlayed) {
        this.mostPlayed = mostPlayed;
    }
}
