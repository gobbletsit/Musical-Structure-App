package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button now_playing, playlists, artist_screen, search_screen;

    Intent nowPlaying, playLists, artistiScreen, searchScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FINDING BUTTONS IN A LAYOUT
        now_playing = (Button)findViewById(R.id.now_playing);
        playlists = (Button) findViewById(R.id.playlists);
        artist_screen = (Button) findViewById(R.id.artist_screen);
        search_screen = (Button) findViewById(R.id.search);

        // INITIALIZING INTENTS
        nowPlaying = new Intent(getApplicationContext(), NowPlaying.class);
        playLists = new Intent(getApplicationContext(), Playlists.class);
        artistiScreen = new Intent(getApplicationContext(), ArtistScreen.class);
        searchScreen = new Intent(getApplicationContext(), SearchScreen.class);

        // SETTING ON CLICK LISTENERS ON BUTTONS FOR SWITCHING ACTIVITES
        now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nowPlaying);
            }
        });

        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(playLists);
            }
        });

        artist_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(artistiScreen);
            }
        });

        search_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(searchScreen);
            }
        });


    }
}
