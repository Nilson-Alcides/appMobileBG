package com.example.appmobilebg.controlador;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.appmobilebg.R;
import com.example.appmobilebg.controlador.LoginActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private static final int TEMPO_TELA_ABERTA = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        inizializarTelaDeLogin();
    }
    private void inizializarTelaDeLogin(){
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
            finish();
                Intent abrirTelaSplash = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(abrirTelaSplash);
            }
        }, TEMPO_TELA_ABERTA);
    }
}