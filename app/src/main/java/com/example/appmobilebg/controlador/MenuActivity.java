package com.example.appmobilebg.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appmobilebg.R;

public class MenuActivity extends AppCompatActivity {
Button buttonCadastrar;
Button buttonConsultar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonConsultar = findViewById(R.id.buttonConsultar);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirCadastrarActivity = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(abrirCadastrarActivity);
            }
        });

        buttonConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirConsultarActivity = new Intent(getApplicationContext(), ConsultaActivity.class);
                startActivity(abrirConsultarActivity);
            }
        });


    }
}