package linkedlist.challenge;


public class RunIt {
    public static void main(String[] args) {
        Album humble = new Album("Humble");
        humble.addSong("Song one", 220);
        humble.addSong("Song two", 240);
        humble.addSong("Song three", 260);
        humble.printSongs();
    }
}
