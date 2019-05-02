package com.hfad.marvelinfinite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Heroes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        Intent intent = getIntent();
        final Character[] heroes = (Character[])intent.getParcelableArrayExtra("Hero List");

        GridView gridView = findViewById(R.id.gridview);
        CharacterAdapter characterAdapter = new CharacterAdapter(this, heroes);
        gridView.setAdapter(characterAdapter);






        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {

                // Sends the position clicked to ChampionActivity to display right Champ

                Intent intent = new Intent(Heroes.this, Character.class);
                intent.putExtra("Hero Index", position);
                intent.putExtra("Hero List", heroes);
                startActivity(intent);


            }
        });

    }

}
