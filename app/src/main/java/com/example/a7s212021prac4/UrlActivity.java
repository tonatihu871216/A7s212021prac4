package com.example.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UrlActivity extends AppCompatActivity {

    ImageView MiImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        MiImagen = findViewById(R.id.miimagen);

        Picasso.get()
                .load("https://i.pinimg.com/originals/5d/a5/46/5da546e8f379580524b4b6037cca3c55.jpg")
                .fit()
                .error(R.mipmap.ic_launcher_round)
                .into(MiImagen);
    }
}