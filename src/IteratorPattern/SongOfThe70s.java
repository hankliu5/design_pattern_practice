package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hankliu on 12/4/16.
 */
public class SongOfThe70s implements SongIterator{
    ArrayList<SongInfo> bestSongs;

    public SongOfThe70s() {
        bestSongs = new ArrayList<>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    public void addSong(String songName, String bandName, int yearRelease) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRelease);
        bestSongs.add(songInfo);
    }

    /* bad code -> DRY
    public ArrayList<SongInfo> getBestSongs() {
        return bestSongs;
    }
    */

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
