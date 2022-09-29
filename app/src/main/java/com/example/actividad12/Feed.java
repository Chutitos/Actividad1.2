package com.example.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Feed extends AppCompatActivity {
    //matar
    TextView nombreRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        nombreRecibido = findViewById(R.id.nombreUsuario);

        Bundle recibeDatos = getIntent().getExtras();
        String nombre = recibeDatos.getString("keyDatos");

        nombreRecibido.setText(nombre);
    }
}