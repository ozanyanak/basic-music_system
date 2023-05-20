package com.company;

import java.util.List;

public class User {
    private String name;
    private List<Playlist> playlists;
    // additional properties like usertype and rights

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }
    public void removeFromPlaylist(Playlist playlist, Song song) {
        if (this.name.equals(playlist.getOwner())) {
            playlist.getSongs().remove(song);
        } else {
            System.out.println("You are not the owner of this playlist");
        }
    }
    public void addToPlaylist(Playlist playlist, Song song) {
        if (this.name.equals(playlist.getOwner())) {
            playlist.getSongs().add(song);
        } else {
            System.out.println("You are not the owner of this playlist");
        }
    }
}
