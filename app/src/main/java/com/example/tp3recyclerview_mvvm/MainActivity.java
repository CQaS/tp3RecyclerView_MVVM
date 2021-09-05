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
        lista.add(new Peliculas("Birdman", R.drawable.p1birdman, "Aunque se estrenó en el año 2001, su trama basada en la ...", "Aunque se estrenó en el año 2001, su trama basada en la autosuperación personal no pasa de moda. La cinta narra la vida de John Nash, un joven genio de las matemáticas que está obsesionado con la búsqueda de una teoría propia y que le lleva a desarrollar esquizofrenia. Esto le provoca que se aleje de su entorno social y no siga las recomendaciones de los médicos","Crowe, Russell","Howard, Ron"));
        lista.add(new Peliculas("Home", R.drawable.p2home, "Oh es un alienígena que tras invadir la Tierra y poner...","Oh es un alienígena que tras invadir la Tierra y poner en peligro a toda su raza se ve obligado a dejar todo y huir sin mirar atrás. En el camino conoce a una adolescente llamada Tip que se encuentra buscando a su madre. Juntos serán capaces de salvarse a sí mismos y al planeta. En esta película se trabaja la empatía y el respeto por el que es diferente, además de mostrar las distintas emociones asociadas.", "Animación", "Tim Johnson"));
        lista.add(new Peliculas("Monstruo viene a mi", R.drawable.p3monstruoviene, "Dirigida por el español J.A. Bayona, su tema principal...", "Dirigida por el español J.A. Bayona, su tema principal gira en torno a la muerte. Conor, el joven protagonista, se enfrenta a la grave enfermedad que está acabando con su madre y, por lo tanto, con su bienestar emocional. Para hacerle frente utiliza la fantasía, y sólo gracias a ella logra toparse con la realidad que le permite comenzar su periodo de sanación. Una gran reflexión sobre las habilidades sociales y la gestión de emociones.", "J.A. Bayona", "Patrick Ness"));
        lista.add(new Peliculas("Viaje de Chihiro", R.drawable.p4viajechihiro, "Dirigida por el español J.A. Bayona, su tema principal...","Su tema principal gira en torno a la muerte. Conor, el joven protagonista, se enfrenta a la grave enfermedad que está acabando con su madre y, por lo tanto, con su bienestar emocional. Para hacerle frente utiliza la fantasía, y sólo gracias a ella logra toparse con la realidad que le permite comenzar su periodo de sanación. Una gran reflexión sobre las habilidades sociales y la gestión de emociones.", "Jordi Teixidor Martínez", "J.A. Bayona"));

        return lista;
    }
}