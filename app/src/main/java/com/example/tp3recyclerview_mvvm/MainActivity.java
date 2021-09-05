package com.example.tp3recyclerview_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tp3recyclerview_mvvm.modeloPeliculas.Peliculas;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvPelis;
    private PeliculasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPelis = findViewById(R.id.RVlistaPelis);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        rvPelis.setLayoutManager(gridLayoutManager);
        adapter = new PeliculasAdapter(obtenerPelis(), this, getLayoutInflater());
        rvPelis.setAdapter(adapter);
    }

    private ArrayList<Peliculas> obtenerPelis()
    {
        ArrayList<Peliculas> lista = new ArrayList<>();
        lista.add(new Peliculas("Marte", R.drawable.p1marte, "Esta película de ciencia ficción, dirigida por Ridley Scott...", "Esta película de ciencia ficción, dirigida por Ridley Scott, tiene como protagonista a Mark Watney (Matt Damon), que debido a varias circunstancias durante una exploración en Marte, se queda totalmente solo en el planeta. Con muy pocos recursos, se trata de una prueba de la esperanza y el instinto de supervivencia del ser humano, ya que no pueden volver a rescatarle hasta que hayan transcurrido varios años.","Mark Watney","Ridley Scot"));
        lista.add(new Peliculas("Wonder", R.drawable.p2wonder, "El protagonista, conocido como Auggie, es un niño de 10 años...","El protagonista, conocido como Auggie, es un niño de 10 años que vive con un casco de astronauta siempre puesto. ¿La razón? Numerosas cirugías le habían dejado un aspecto deforme, por lo que se ha ocultado siempre del resto incluso negándose a acudir a la escuela. Pero todo cambia cuando debe comenzar el instituto, momento en el que deberá mostrarse al mundo y relacionarse con sus compañeros de clase.", "Auggie", "R. J. Palacio"));
        lista.add(new Peliculas("Monstruo viene a mi", R.drawable.p3monstruoviene, "Dirigida por el español J.A. Bayona, su tema principal...", "Dirigida por el español J.A. Bayona, su tema principal gira en torno a la muerte. Conor, el joven protagonista, se enfrenta a la grave enfermedad que está acabando con su madre y, por lo tanto, con su bienestar emocional. Para hacerle frente utiliza la fantasía, y sólo gracias a ella logra toparse con la realidad que le permite comenzar su periodo de sanación. Una gran reflexión sobre las habilidades sociales y la gestión de emociones.", "J.A. Bayona", "Patrick Ness"));
        lista.add(new Peliculas("Viaje de Chihiro", R.drawable.p4viajechihiro, "Dirigida por el español J.A. Bayona, su tema principal...","Su tema principal gira en torno a la muerte. Conor, el joven protagonista, se enfrenta a la grave enfermedad que está acabando con su madre y, por lo tanto, con su bienestar emocional. Para hacerle frente utiliza la fantasía, y sólo gracias a ella logra toparse con la realidad que le permite comenzar su periodo de sanación. Una gran reflexión sobre las habilidades sociales y la gestión de emociones.", "Jordi Teixidor Martínez", "J.A. Bayona"));


        return lista;
    }
}