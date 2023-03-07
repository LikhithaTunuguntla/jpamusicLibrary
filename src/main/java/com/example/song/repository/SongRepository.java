// Write your code here
package com.example.song.repository;

import java.util.ArrayList;
import com.example.song.model.Song;

public interface SongRepository{
    ArrayList<Song> getSongs();
    Song getSongById(int songId);
    Song addSong(Song song);
    void deleteSong(int songId);
    Song updateSong(int songId,Song song);
}