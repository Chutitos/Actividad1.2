package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    EditText nombreUsuario;
    Button  Registrarse;

    public void enviarDatos (View view){
        Bundle envioDatos = new Bundle();
        envioDatos.putString("keyDatos", nombreUsuario.getText().toString());

        Intent intent = new Intent(Registro.this, Feed.class);
        intent.putExtras(envioDatos);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombreUsuario = findViewById(R.id.nombreUsuario);
        Registrarse = findViewById(R.id.Registrarse);

        Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos(view);
            }
        });
    }


}