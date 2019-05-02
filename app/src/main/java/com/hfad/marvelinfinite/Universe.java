package com.hfad.marvelinfinite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Universe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universe);



        ImageView MCU = findViewById(R.id.mcu);
        ImageView Fox = findViewById(R.id.fox);
        ImageView Comics = findViewById(R.id.comics);

        MCU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent list = new Intent(Universe.this, Heroes.class);
                list.putExtra("Hero List", heroes);

                Intent intent = new Intent(Universe.this, Heroes.class);
                startActivity(intent);

            }
        });


        Fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent list = new Intent(Universe.this, Heroes.class);
                list.putExtra("Hero List", heroesFox);

                Intent intent = new Intent(Universe.this, Heroes.class);
                startActivity(intent);

            }
        });

        Comics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent list = new Intent(Universe.this, Heroes.class);
                list.putExtra("Hero List", heroes);

                Intent intent = new Intent(Universe.this, Heroes.class);
                startActivity(intent);


            }
        });
    }

    public Character[] heroes = {
            new Character("Ant-Man", R.drawable.ant, R.raw.antman, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Black Panther", R.drawable.blackpanther, R.raw.blackpanther, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Captain America", R.drawable.cap, R.raw.captainamerica, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Doctor Strange", R.drawable.ds, R.raw.doctorstrange, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Groot", R.drawable.groot, R.raw.groot, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Hawkeye", R.drawable.hawkeye, R.raw.hawkeye, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Iron Man", R.drawable.ironman, R.raw.ironman, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Quicksilver", R.drawable.qs, R.raw.quicksilver, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Rocket Raccoon", R.drawable.rocket, R.raw.rocketracoon, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Scarlet Witch", R.drawable.sw, R.raw.scarletwitch, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Spider-Man", R.drawable.sm, R.raw.spiderman, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Star-Lord", R.drawable.sl, R.raw.starlord, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Thor", R.drawable.thor, R.raw.thor, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Winter Soldier", R.drawable.bucky, R.raw.wintersoldier, "MCU", "status", "hi", new ArrayList<Character>()),


    };

    public Character[] heroesFox = {
            new Character("Wolverine", 1, R.raw.wolverine, "MCU", "status", "hi", new ArrayList<Character>()),
            new Character("Quicksilver", 1, R.raw.quicksilverfox, "MCU", "status", "hi", new ArrayList<Character>()),
    };


}
