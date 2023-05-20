package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Initialize a list of musicians and songs
        List<Musician> musicians = new ArrayList<>();
        List<Song> songs = new ArrayList<>();

        // Add some example data to the lists
        Musician musician1 = new Musician();
        musician1.setName("John");
        musician1.setLastname("Doe");
        musician1.setFollowers(100);
        musicians.add(musician1);

        Song song1 = new Song();
        song1.setName("song1");
        song1.setArtist(musician1);
        song1.setLikes(50);
        songs.add(song1);

        // Initialize a MusicLibrary object and pass in the list of musicians and songs
        MusicLibrary library = new MusicLibrary(musicians, songs);

        // Example usage of the methods
        Musician mostFollowedMusician = library.getMostFollowedMusician();
        System.out.println("Most followed musician: " + mostFollowedMusician.getName() + " " + mostFollowedMusician.getLastname());

        Song mostLikedSong = library.getMostLikedSong();
        System.out.println("Most likedsong: " + mostLikedSong.getName() + " by " + mostLikedSong.getArtist().getName() + " " + mostLikedSong.getArtist().getLastname());

        // Add a new musician
        // Add a new musician
        Musician musician2 = new Musician();
        musician2.setName("Jane");
        musician2.setLastname("Smith");
        musician2.setFollowers(200);
        library.addMusician(musician2);
        System.out.println("Added musician: " + musician2.getName() + " " + musician2.getLastname());

        // Update a musician's follower count
        musician1.setFollowers(150);
        library.updateMusician(musician1);
        System.out.println("Updated musician: " + musician1.getName() + " " + musician1.getLastname() + " now has " + musician1.getFollowers() + " followers.");

        // Delete a musician
        library.deleteMusician(musician2);
        System.out.println("Deleted musician: " + musician2.getName() + " " + musician2.getLastname());

        // Change a song's artist
        song1.setArtist(musician1);
        library.changeSongArtist(song1);
        System.out.println("Changed artist of song: " + song1.getName()+ " to " + song1.getArtist().getName()+ " " +song1.getArtist().getLastname());
    }

}
