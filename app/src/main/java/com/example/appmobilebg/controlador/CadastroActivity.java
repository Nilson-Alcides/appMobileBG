package com.example.appmobilebg.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appmobilebg.R;
import com.example.appmobilebg.dao.DaoUsuario;
import com.example.appmobilebg.dto.UsuarioDTO;

public class CadastroActivity extends AppCompatActivity {
    Button buttonSalvarUsuario;
    EditText editTextNome;
    EditText editTextLogin;
    EditText editTextSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        buttonSalvarUsuario = findViewById(R.id.buttonSalvarUsuario);
        editTextNome = findViewById(R.id.editTextNome);
        editTextLogin = findViewById(R.id.editTextLogin);
        editTextSenha = findViewById(R.id.editTextSenha);

        buttonSalvarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UsuarioDTO usuarioDTO = new UsuarioDTO(editTextLogin.getText().toString(),
                        editTextNome.getText().toString(),
                        editTextSenha.getText().toString());
                DaoUsuario daoUsuario = new DaoUsuario(getApplicationContext());
                try{
                    if(daoUsuario.salvarUsuario(usuarioDTO) > 0){
                        Toast.makeText(getApplicationContext(), "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Log.d("Erro-ao-inserir: ", e.toString());
                    Toast.makeText(getApplicationContext(), "Erro ao Inserir: " + e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}