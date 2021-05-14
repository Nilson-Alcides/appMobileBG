package com.example.appmobilebg.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.appmobilebg.R;
import com.example.appmobilebg.dao.DaoUsuario;
import com.example.appmobilebg.dto.UsuarioDTO;

import java.util.ArrayList;

public class ConsultaActivity extends AppCompatActivity {
Button buttonConsultar;
ListView listViewUsuario;
ArrayList<UsuarioDTO> arrayListUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);
        buttonConsultar = findViewById(R.id.buttonConsultar);
        listViewUsuario = findViewById(R.id.listViewUsuario);
        DaoUsuario daoUsuario = new DaoUsuario(getApplicationContext());
        arrayListUsuario = daoUsuario.consultarTodos();
        ArrayAdapter adapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, arrayListUsuario);
        listViewUsuario.setAdapter(adapter);
    }
}