package com.example.tp3recyclerview_mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp3recyclerview_mvvm.modeloPeliculas.Peliculas;

public class DetallesActivity extends AppCompatActivity
{
    private TextView tituloDetalles, reseniaDetalles;
    private ImageView portadaDetalles;
    private Peliculas pelisDetalles;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        iniciar();
        pelisDetalles = (Peliculas) getIntent().getExtras().getSerializable("itemPelis");
        portadaDetalles.setImageResource(pelisDetalles.getFoto());

        tituloDetalles.setText("Titulo: " + pelisDetalles.getTitulo() + "\nDirector: " + pelisDetalles.getDirector());
        reseniaDetalles.setText("Actor: " + pelisDetalles.getActor() + "\n\n" + pelisDetalles.getDescripcion());
    }

    private void iniciar()
    {
        tituloDetalles = findViewById(R.id.txtTituloDetalle);
        reseniaDetalles = findViewById(R.id.txtReseniaDetalles);
        portadaDetalles = findViewById(R.id.ivPortadaDetalles);
    }


}