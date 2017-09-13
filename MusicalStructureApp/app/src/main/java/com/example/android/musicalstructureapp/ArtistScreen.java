package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by gobov on 4/24/2017.
 */

public class ArtistScreen extends AppCompatActivity {

    Button main_activity2, playlists3, now_playing2, search_screen3;

    Intent mainActivity2, playLists3, nowPlaying2, searchScreen3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_screen);

        // FINDING BUTTONS IN A LAYOUT
        main_activity2 = (Button)findViewById(R.id.main_3);
        playlists3 = (Button) findViewById(R.id.playlists_3);
        now_playing2 = (Button) findViewById(R.id.now_playing_3);
        search_screen3 = (Button) findViewById(R.id.search_4);

        // INITIALIZING INTENTS
        mainActivity2 = new Intent(getApplicationContext(), MainActivity.class);
        playLists3 = new Intent(getApplicationContext(), Playlists.class);
        nowPlaying2 = new Intent(getApplicationContext(), NowPlaying.class);
        searchScreen3 = new Intent(getApplicationContext(), SearchScreen.class);

        // SETTING ON CLICK LISTENERS ON BUTTONS FOR SWITCHING ACTIVITES
        main_activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity2);
                finish();
            }
        });

        playlists3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(playLists3);
                finish();
            }
        });

        now_playing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nowPlaying2);
                finish();
            }
        });

        search_screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(searchScreen3);
                finish();
            }
        });
    }
}
