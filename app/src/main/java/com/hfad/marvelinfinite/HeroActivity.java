package com.hfad.marvelinfinite;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class HeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        Intent intent = getIntent();
        int position = intent.getIntExtra("Hero Index", 0);

        Character[] heroes = (Character[])intent.getSerializableExtra("Hero List");
        Character hero = heroes[position];

        final VideoView videoView = findViewById(R.id.moving);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + hero.getVideo());
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnCompletionListener ( new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                videoView.start();
            }
        });
    }

}
