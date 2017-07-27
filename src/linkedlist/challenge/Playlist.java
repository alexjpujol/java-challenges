package linkedlist.challenge;

import java.util.LinkedList;

public class Playlist {

    private String name;
    private LinkedList<Song> songs;

    Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<Song>();
    }
}
