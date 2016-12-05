package IteratorPattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class RadioStation {
    public static void main(String[] args) {
        SongOfThe70s songOfThe70s = new SongOfThe70s();
        SongOfThe80s songOfThe80s = new SongOfThe80s();
        SongOfThe90s songOfThe90s = new SongOfThe90s();

        DiscJocket madMike = new DiscJocket(songOfThe70s, songOfThe80s, songOfThe90s);
        madMike.showTheSongs2();
    }
}
