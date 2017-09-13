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

public class Playlists extends AppCompatActivity {

    Button main_activity3, artist_screen3, now_playing3, search_screen4;

    Intent mainActivity3, artistScreen3, nowPlaying3, searchScreen4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlists);

        // FINDING BUTTONS IN A LAYOUT
        main_activity3 = (Button)findViewById(R.id.main_2);
        artist_screen3 = (Button) findViewById(R.id.artist_screen_3);
        now_playing3 = (Button) findViewById(R.id.now_playing_2);
        search_screen4 = (Button) findViewById(R.id.search_3);

        // INITIALIZING INTENTS
        mainActivity3 = new Intent(getApplicationContext(), MainActivity.class);
        artistScreen3 = new Intent(getApplicationContext(), ArtistScreen.class);
        nowPlaying3 = new Intent(getApplicationContext(), NowPlaying.class);
        searchScreen4 = new Intent(getApplicationContext(), SearchScreen.class);

        // SETTING ON CLICK LISTENERS ON BUTTONS FOR SWITCHING ACTIVITES
        main_activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity3);
                finish();
            }
        });

        artist_screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(artistScreen3);
                finish();
            }
        });

        now_playing3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nowPlaying3);
                finish();
            }
        });

        search_screen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(searchScreen4);
                finish();
            }
        });


    }
}
