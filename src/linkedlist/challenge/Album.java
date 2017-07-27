package linkedlist.challenge;


import linkedlist.challenge.Song;

import java.util.ArrayList;

public class Album {

    private String name;
    private ArrayList<Song> songs;

    Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songName, int duration) {
        if (findSong(songName) == null) {
            songs.add(new Song(songName, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String songName) {
        for(int i = 0; i < songs.size(); i++) {
            Song targetSong = songs.get(i);
            if(targetSong.getTitle().equals(songName)) {
                return targetSong;
            }
        }
        return null;
    }

    public void printSongs() {
        for(int i = 0; i < this.songs.size(); i++) {
            System.out.println(this.songs.get(i).getTitle());
        }
    }
}
