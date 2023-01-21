package com.example.a17_01_2023;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    //metodos

    MediaPlayer cancion;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //oculte el action bar
        ActionBar barra = getSupportActionBar();
        barra.hide();

        //lanzar cancion
        cancion=MediaPlayer.create(this,R.raw.cancion);
        cancion.start();

        //temporizar la duracion del splash
        TimerTask inicioapp= new TimerTask() {
            @Override
            public void run() {

                //lanzar una nueva actividad
                Intent intent= new Intent(splash.this,MainActivity.class);
                startActivity(intent);

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioapp,10000);



    }
}