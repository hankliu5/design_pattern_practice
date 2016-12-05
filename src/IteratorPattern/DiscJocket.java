package IteratorPattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by hankliu on 12/4/16.
 */
public class DiscJocket {
    SongOfThe70s songs70s;
    SongOfThe80s songs80s;
    SongOfThe90s songs90s;
    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;


    public DiscJocket(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {
        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    /* violates DRY
    public void showTheSongs() {
        ArrayList aL70sSongs = songs70s.getBestSongs();
        System.out.println("Songs of the 70s\n");
        for (int i = 0; i < aL70sSongs.size(); i++) {
            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }

        SongInfo[] array80sSongs = songs80s.getBestSongs();
        System.out.println("Songs of the 80s\n");
        for (int i = 0; i < array80sSongs.length; i++) {
            SongInfo bestSongs = array80sSongs[i];
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();
        System.out.println("Songs of the 90s\n");
        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }
    }
    */

    public void showTheSongs2() {
        Iterator song70s = iter70sSongs.createIterator();
        Iterator song80s = iter80sSongs.createIterator();
        Iterator song90s = iter90sSongs.createIterator();
        System.out.println("\nSongs of the 70s\n");
        printTheSongs(song70s);
        System.out.println("\nSongs of the 80s\n");
        printTheSongs(song80s);
        System.out.println("\nSongs of the 90s\n");
        printTheSongs(song90s);
    }

    public void printTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
