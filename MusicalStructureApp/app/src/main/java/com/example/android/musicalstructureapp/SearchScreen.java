package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicalstructureapp.R.layout.search_screen;

/**
 * Created by gobov on 4/24/2017.
 */

public class SearchScreen extends AppCompatActivity {

    Button main_activity4, artist_screen4, now_playing4, playlists4;

    Intent mainActivity4, artistScreen4, nowPlaying4, playLists4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(search_screen);

        // FINDING BUTTONS IN A LAYOUT
        main_activity4 = (Button)findViewById(R.id.main_4);
        artist_screen4 = (Button) findViewById(R.id.artist_screen_4);
        now_playing4 = (Button) findViewById(R.id.now_playing_4);
        playlists4 = (Button) findViewById(R.id.playlists_4);

        // INITIALIZING INTENTS
        mainActivity4 = new Intent(getApplicationContext(), MainActivity.class);
        artistScreen4 = new Intent(getApplicationContext(), ArtistScreen.class);
        nowPlaying4 = new Intent(getApplicationContext(), NowPlaying.class);
        playLists4 = new Intent(getApplicationContext(), Playlists.class);

        // SETTING ON CLICK LISTENERS ON BUTTONS FOR SWITCHING ACTIVITES
        main_activity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity4);
                finish();
            }
        });

        artist_screen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(artistScreen4);
                finish();
            }
        });

        now_playing4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nowPlaying4);
                finish();
            }
        });

        playlists4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(playLists4);
                finish();
            }
        });
    }
}
