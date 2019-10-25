package com.jefferson.puxafrango;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button correr = (Button)findViewById(R.id.button);

        correr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(R.drawable.animation);
                AnimationDrawable correndo = (AnimationDrawable)imageView.getDrawable();
                correndo.start();

            }
        });

    }
}
