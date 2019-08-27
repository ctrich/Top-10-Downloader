package com.example.top10downloader;

import java.util.ArrayList;

public class ParseSongs {
    private static final String TAG = "ParseSongs";
    private ArrayList<FeedEntry> songs;

    public ParseSongs() {
        this.songs = new ArrayList<>();
    }

    public ArrayList<FeedEntry> getSongs() {
        return songs;
    }
}