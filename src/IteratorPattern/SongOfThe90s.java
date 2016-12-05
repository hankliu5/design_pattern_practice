package IteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by hankliu on 12/4/16.
 */
public class SongOfThe90s implements SongIterator{
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();
    int hashKey = 0;

    public SongOfThe90s() {
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
    }

    public void addSong(String songName, String bandName, int yearRelease) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRelease);
        bestSongs.put(hashKey++, songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}