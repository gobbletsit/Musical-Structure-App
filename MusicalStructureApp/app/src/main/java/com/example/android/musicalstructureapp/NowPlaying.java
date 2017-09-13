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

public class NowPlaying extends AppCompatActivity {

    Button main_activity, playlists2, artist_screen2, search_screen2;

    Intent mainActivity, playLists2, artistiScreen2, searchScreen2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // FINDING BUTTONS IN A LAYOUT
        main_activity = (Button)findViewById(R.id.main_act);
        playlists2 = (Button) findViewById(R.id.playlists_2);
        artist_screen2 = (Button) findViewById(R.id.artist_screen_2);
        search_screen2 = (Button) findViewById(R.id.search_2);

        // INITIALIZING INTENTS
        mainActivity = new Intent(getApplicationContext(), MainActivity.class);
        playLists2 = new Intent(getApplicationContext(), Playlists.class);
        artistiScreen2 = new Intent(getApplicationContext(), ArtistScreen.class);
        searchScreen2 = new Intent(getApplicationContext(), SearchScreen.class);

        // SETTING ON CLICK LISTENERS ON BUTTONS FOR SWITCHING ACTIVITES
        main_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainActivity);
                finish();
            }
        });

        playlists2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(playLists2);
                finish();
            }
        });

        artist_screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(artistiScreen2);
                finish();
            }
        });

        search_screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(searchScreen2);
                finish();
            }
        });

    }
}
