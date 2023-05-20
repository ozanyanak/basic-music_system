package com.company;

import java.util.List;

public class MusicLibrary {
    private List<Musician> musicians;
    private List<Song> songs;

    public MusicLibrary(List<Musician> musicians, List<Song> songs) {
        this.musicians = musicians;
        this.songs = songs;
    }

    public Musician getMostFollowedMusician() {
        Musician mostFollowed = null;
        int maxFollowers = 0;
        for (Musician musician : musicians) {
            if (musician.getFollowers() > maxFollowers) {
                mostFollowed = musician;
                maxFollowers = musician.getFollowers();
            }
        }
        return mostFollowed;
    }

    public Song getMostLikedSong() {
        Song mostLiked = null;
        int maxLikes = 0;
        for (Song song : songs) {
            if (song.getLikes() > maxLikes) {
                mostLiked = song;
                maxLikes =song.getLikes();
            }
        }
        return mostLiked;
    }
    public void addMusician(Musician musician) {
        this.musicians.add(musician);
    }

    public void updateMusician(Musician musician) {
        for (int i = 0; i < musicians.size(); i++) {
            if (musicians.get(i).getName().equals(musician.getName()) && musicians.get(i).getLastname().equals(musician.getLastname())) {
                musicians.set(i, musician);
                break;
            }
        }
    }

    public void deleteMusician(Musician musician) {
        this.musicians.remove(musician);
    }

    public void changeSongArtist(Song song) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(song.getName())) {
                songs.get(i).setArtist(song.getArtist());
                break;
            }
        }
    }
}
